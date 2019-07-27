package webLogic.controller;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.parser.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import webLogic.dto.ProductDto;
import webLogic.dto.testDto;
import webLogic.service.SaveDataServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import webLogic.service.XSLXwork;
import webLogic.service.XSLXworkInterface;

import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by yansolo on 15.08.2018.
 */
@Controller
public class MainController {


    @Autowired
    public XSLXworkInterface xslXworkImp;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getIndexPage(HttpSession session){

        //Test excele

       // System.out.println(XSLXwork.parse("excel.xls"));
        //xslXworkImp.testMethod();

        return "index";
    }




// produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE
   // @RequestMapping(value = "/testMethod",method = RequestMethod.POST)


    //@RequestBody testDto data,
//    @RequestParam("one") String one,
//    @RequestParam("two") String two,
    //@RequestParam(value = "request",required = false) testDto one








    @RequestMapping(value = "/saveCompProd",method = RequestMethod.POST) public @ResponseBody
    String saveOrUpdateCompProd(
            HttpSession session){




        return "index";
    }


}
