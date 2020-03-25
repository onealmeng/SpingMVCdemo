package com.oneal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by oneal on 2020/3/11.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public String add(HttpServletRequest request) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");


        return id + name;
    }
}
