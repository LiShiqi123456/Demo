package com.java.controller;

import com.java.pojo.Rubbish;
import com.java.service.RubbishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/rubbish")
public class RubbishController {
    @Autowired
    private RubbishService rubbishService;
    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    @ResponseBody
    public List<Rubbish> getrubbish(String RuName, HttpServletRequest request) throws UnsupportedEncodingException {
        String name = request.getParameter("RuName");
        String result = new String(name.getBytes("ISO-8859-1"),"UTF-8");
        System.out.println(result);
        return  rubbishService.getrubbish(result);
    }

}
