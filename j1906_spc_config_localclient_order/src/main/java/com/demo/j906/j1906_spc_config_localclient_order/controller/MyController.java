package com.demo.j906.j1906_spc_config_localclient_order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jeffrey on 2019/11/15.
 */
@RestController
public class MyController {
    @Value("${server.port}")
    private String port;

    @Value("${myclass}")
    private String myClass;
   @RequestMapping("/info")
    public String showInfo(){
        String msg = "port:"+port+"msg = "+myClass;
        return msg;
    }
}
