package webLogic.service.EditWebService;

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
import webLogic.service.EditWebService.DataService.AllDayDataServiceInterface;
import webLogic.service.SaveDataServiceInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by yansolo on 16.08.2018.
 */
@Service("EditWebService")
public class EditWebServiceImp implements EditWebServiceInterface {

    @Autowired
    public SaveDataDaoInterface saveDataDaoImp;

    @Autowired
    public AllDayDataServiceInterface allDayDataService;

    //ToDo
    @Override
    public LinkedList<AllDayDto> getAllDayDtoByNumberPage(int fromRecord,int countRecord) {

        int defultNumber = 10;


        if(countRecord != 0) {
            List AllDayList = saveDataDaoImp.getAllDayByNumberPage(fromRecord,countRecord);

           // AllDayEntity allDayEntity = (AllDayEntity) AllDayList.get(0);



        }

        return null;
    }


}