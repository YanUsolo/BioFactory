package webLogic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import webLogic.service.ClinetService.ClientServiceInterface;


import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by yansolo on 15.08.2018.
 */
@Controller
public class ClientController {

    @Autowired
    public ClientServiceInterface clientServiceImp;


    @RequestMapping(value = "/saveAllDay",method = RequestMethod.POST)
    public @ResponseBody
    String saveOrUpdateAllDay(@RequestParam Map<String,String> products,
                              HttpSession session) throws Exception{

        System.out.println("POST FROM BioFactory : save AllDay");

        clientServiceImp.saveOrUpdateAllDay(products);

        return "All right";
    }
//
//    @RequestMapping(value = "/saveProducts",method = RequestMethod.POST)
//    public @ResponseBody
//    String saveOrUpdateProduct(@RequestParam Map<String,String> products,
//                               HttpSession session) throws Exception{
//
//
//        System.out.println("POST FROM BioFactory save Prod : ");
//
//        clientServiceImp.saveOrUpdateProducts(products);
//
//        return "All right";
//    }
//
//
//    public @ResponseBody
//    String testMethod( @RequestParam("AllDay") String allday,
//                       HttpSession session){
//
//        System.out.println("POST FROM BioFactory :  testMethod");
//
//        System.out.println("" + allday);
//
//        System.out.println("");
//
//
//
//
//
//
//        return "All right";
//    }
//

}
