package webLogic.service.EditWebService;

import webLogic.dto.AllDayDto;

import java.util.LinkedList;
import java.util.Map;

/**
 * Created by yansolo on 16.08.2018.
 */
public interface EditWebServiceInterface {


    public LinkedList<AllDayDto> getAllDayDtoByNumberPage(int fromRecord,int countRecord);
}
