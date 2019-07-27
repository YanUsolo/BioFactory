package webLogic.service.ClinetService;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webLogic.dao.SaveDataDaoInterface;
import webLogic.dto.AllDayDto;
import webLogic.dto.ProductComputationlyDto;
import webLogic.dto.ProductDto;
import webLogic.entity.AllDayEntity;
import webLogic.entity.ProductComputationlyEntity;
import webLogic.entity.ProductEntity;
import webLogic.service.SaveDataServiceInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by yansolo on 16.08.2018.
 */
@Service("clientService")
public class ClientServiceImp implements ClientServiceInterface{

    @Autowired
    public SaveDataDaoInterface saveDataDaoImp;


    public void TestNewVersion()
    {

    }
    //---------------------------------------CALL FROM CONTOLLER METHODS-----------------------------------------------------------------------
    //Данный метод вызывается с Controllera
    public void saveOrUpdateProducts(Map<String,String> productMaps) throws Exception
    {

        List<ProductDto> productDtoList = parseMapToDtoProduct(productMaps);

     //   List<ProductEntity> productEntityList =parseDtoToEntityProduct(productDtoList);
        updateOrSaveProduct(productDtoList);



    }

    //Данный метод вызывается с Controllera
    public void saveOrUpdateAllDay(Map<String,String> allDayMaps) throws Exception
    {
      //  AllDayDto allDayDto = parseMapToDtoAllDay(allDayMaps.get("AllDay"));

        AllDayDto allDayDto = parseMapToDtoAllDay(allDayMaps.get("AllDay"));

        updateOrSaveAllDay(allDayDto);

        List<ProductDto> productDtoList = parseMapToDtoProduct(allDayMaps);

        updateOrSaveProduct(productDtoList);

        //Fix shit//ToDo
        List<ProductComputationlyDto> productCompDtoList = parseMapToDtoProductComp(allDayMaps);

        updateOrSaveProductComp(productCompDtoList,allDayDto);


    }

    //-----------------------------------------------------SAVE OR UPDATE METHODS---------------------------------------------------------

    //ToDo
    public void updateOrSaveProductComp(List<ProductComputationlyDto> productCompDtoList,AllDayDto allDayDto)
    {
        AllDayEntity allDayEntity = saveDataDaoImp.getAllDayByDate(allDayDto.getDate().replace(".", "-"));
        ProductComputationlyEntity prodCompTempEntity = null;
        //Fix
       // ProductEntity productEntity = saveDataDaoImp.getProductByIdProduct("20819220");
        try {
            for (ProductComputationlyDto prodCmp:productCompDtoList)
            {


                ProductEntity productEntity = saveDataDaoImp.getProductByIdProduct(prodCmp.getUniqueId_Product());
                if(saveDataDaoImp.isProdCompByIdProduct(prodCmp.getUniqueId_Product())){

                    prodCompTempEntity = saveDataDaoImp.getProdCompByIdProduct(prodCmp.getUniqueId_Product());

                   // String str = prodCompTempEntity.getN
                    //Fix//ToDo
                    prodCompTempEntity.resetProductComputationlyEntity(prodCmp,allDayEntity);

                    saveDataDaoImp.saveOrUpdateProductComps(prodCompTempEntity);
                }else{

                    prodCompTempEntity = new ProductComputationlyEntity(prodCmp,allDayEntity,productEntity);
                    saveDataDaoImp.saveOrUpdateProductComps(prodCompTempEntity);
                }
            }


        }catch (Exception ex){
            System.out.println("" + ex);
        }


    }

    public void updateOrSaveAllDay(AllDayDto allDayDto)
    {
        try {
            if (saveDataDaoImp.isAllDayByDate(allDayDto.getDate().replace(".", "-"))) {

                AllDayEntity allDayEntity = saveDataDaoImp.getAllDayByDate(allDayDto.getDate().replace(".", "-"));

                allDayEntity.resetAllDayEntity(allDayDto);

                saveDataDaoImp.saveOrUpdateAllDay(allDayEntity);


            } else {
                AllDayEntity allDayEntity = new AllDayEntity(allDayDto);

                saveDataDaoImp.saveOrUpdateAllDay(allDayEntity);
            }
        } catch (Exception ex) {

                System.out.println("" + ex);
        }

    }


    public void updateOrSaveProduct(List<ProductDto> productDtoList)
    {
     //   AllDayEntity allDayEntity = saveDataDaoImp.getAllDayByDate(allDayDto.getDate().replace(".", "-"));
        ProductEntity productEntity = null;
        try {
            for (ProductDto prodDto : productDtoList)
            {
                if(saveDataDaoImp.isProdByIdProduct(prodDto.getUniqueProd_id())){

               //    ProductEntity asd = saveDataDaoImp.getProductByIdProduct("2");
                    productEntity = saveDataDaoImp.getProductByIdProduct(prodDto.getUniqueProd_id());

                    productEntity.resetProductEntity(prodDto);

                    saveDataDaoImp.updateOrSaveProduct(productEntity);
                }else{

                    productEntity = new ProductEntity(prodDto);
                    saveDataDaoImp.updateOrSaveProduct(productEntity);
                }
            }


        }catch (Exception ex){
            System.out.println("" + ex);
        }


    }





//---------------------------------------------Parse MAP TO DTO-------------------------------------------------------------------------------

    private AllDayDto parseMapToDtoAllDay(String allDayJson)  throws Exception
    {
        ObjectMapper mapper = new ObjectMapper();
        AllDayDto allDayDto = null;
        try{
            allDayDto = mapper.readValue(allDayJson, AllDayDto.class);
        }catch (Exception e){
            System.out.println(e);
        }
        return allDayDto;
    }

    private List<ProductComputationlyDto> parseMapToDtoProductComp(Map<String,String> productCompJson)
    {
        ObjectMapper mapper = new ObjectMapper();
        List<ProductComputationlyDto> productDtoList = new LinkedList<ProductComputationlyDto>();
        ProductComputationlyDto productComputationlyDto = null;

        for(int i = 1;i <= (productCompJson.size()-1)/2;i++)
        {
            String json = productCompJson.get("ProductComp_" + i);
            try {
                productComputationlyDto = mapper.readValue(json, ProductComputationlyDto.class);
            }catch (Exception e){
                System.out.println("" + e);
            }
            productDtoList.add(productComputationlyDto);
        }

        return productDtoList;
    }

    private List<ProductDto> parseMapToDtoProduct(Map<String,String> prodMaps)
    {
        ObjectMapper mapper = new ObjectMapper();
        List<ProductDto> productDtoList = new LinkedList<ProductDto>();
        ProductDto tempProdDto = null;

        for(int i = 1;i <= (prodMaps.size()-1)/2;i++)
        {
            String json = prodMaps.get("Product_" + i);
            try {
                tempProdDto = mapper.readValue(json, ProductDto.class);
            }catch (Exception e){
                System.out.println("" + e);
            }
            productDtoList.add(tempProdDto);
        }
        return productDtoList;
    }

    private List<ProductEntity> parseDtoToEntityProduct(List<ProductDto> productDtoList)
    {
        List<ProductEntity> productEntityList = new LinkedList<ProductEntity>();
        for (ProductDto prodDto : productDtoList)
        {
            productEntityList.add(new ProductEntity(prodDto.getUniqueProd_id(),prodDto.getName(),
                    prodDto.getCoffSV(),prodDto.getCoffWater(),prodDto.getCoffMetana(),prodDto.getValueGas()));
        }

        return productEntityList;
    }

//---------------------------------------------get DATA TO DO-------------------------------------------------------------------------------

    //public int count


}