package webLogic.service;

import webLogic.dto.AllDayDto;
import webLogic.dto.ProductDto;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by yansolo on 16.08.2018.
 */
public interface SaveDataServiceInterface {

    public void saveOrUpdateProducts(Map<String,String> productMaps)  throws Exception;
    public void saveOrUpdateAllDay(Map<String,String> allDayMaps) throws Exception;
    public LinkedList<AllDayDto> getAllDayDtoByNumberPage(int numberPage);
}
