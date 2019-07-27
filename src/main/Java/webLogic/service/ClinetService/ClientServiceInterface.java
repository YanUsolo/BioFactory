package webLogic.service.ClinetService;

import webLogic.dto.AllDayDto;

import java.util.LinkedList;
import java.util.Map;

/**
 * Created by yansolo on 16.08.2018.
 */
public interface ClientServiceInterface {

    public void saveOrUpdateProducts(Map<String, String> productMaps)  throws Exception;
    public void saveOrUpdateAllDay(Map<String, String> allDayMaps) throws Exception;

}
