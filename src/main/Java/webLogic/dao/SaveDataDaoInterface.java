package webLogic.dao;

import webLogic.entity.AllDayEntity;
import webLogic.entity.ProductComputationlyEntity;
import webLogic.entity.ProductEntity;

import java.util.List;
import java.util.Set;

/**
 * Created by yansolo on 16.08.2018.
 */
public interface SaveDataDaoInterface {

    public boolean saveProduct(ProductEntity productEntity);

    public boolean saveProducts(List<ProductEntity> productEntityList);

    public boolean saveOrUpdateAllDay(AllDayEntity allDayEntity);

    public boolean saveOrUpdateProductComps(Set<ProductComputationlyEntity> productCompEntitySet);

    public boolean updateOrSaveProduct(ProductEntity productEntity);

    public AllDayEntity getAllDayByDate(String date);

    public boolean isAllDayByDate(String date);

    public boolean isProdCompByIdProduct(String uniqueId_Product);

    public boolean isProdByIdProduct(String uniqueId_Product);

    public ProductComputationlyEntity getProdCompByIdProduct(String uniqueId_Product);

    public ProductEntity getProductByIdProduct(String uniqueId_Product);

    public boolean saveOrUpdateProductComps(ProductComputationlyEntity prodEnity);

    public List getAllDayByDates(String dateLater,String dateBefor);

    public List getAllDayByNumberPage(int fromPage,int countPage);


}
