package com.main.register.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/api")
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request) {
        String url = "";
        String requestHeader = request.getHeader("user-agent");
        String[] deviceArray = new String[]{"android", "iphone","ipad","windows phone"};
        //判断是否pc端登陆
        boolean pc = true;
        if (requestHeader == null) {
            pc = true;
        }
        requestHeader = requestHeader.toLowerCase();
        for (String device : deviceArray) {
            if (requestHeader.indexOf(device) != -1) {
                pc = false;
                break;
            }
        }
        if(pc) url = "/pc_index.html";
        else url = "/app_index.html";
        return url;
    }
}
