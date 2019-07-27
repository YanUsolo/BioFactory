package webLogic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import webLogic.service.EditWebService.EditWebServiceInterface;
import webLogic.service.SaveDataServiceInterface;

import javax.servlet.http.HttpSession;

/**
 * Created by yansolo on 13.11.2018.
 */
@Controller
public class EditController {

    @Autowired
    public EditWebServiceInterface editWebServiceImp;

    @RequestMapping(value = "/getEditPage",method = RequestMethod.POST)
    public String getEditDataPage(HttpSession session, Model model){

        //Test excele

        // System.out.println(XSLXwork.parse("excel.xls"));
        // xslXworkImp.testMethod();
        editWebServiceImp.getAllDayDtoByNumberPage(0,10);
        return "editDataPage";
    }
}
