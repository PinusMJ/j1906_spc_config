package com.demo.j1906.j1906_spc_config_localclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jeffrey on 2019/11/15.
 */

@RestController
public class ConfigController {

    @Value("${server.port}")
    private String port;
    @Value("${myname}")
    private String name;
    @RequestMapping("/info")
    public String  shoInfo(){
        String str = "port:"+port +" myname:"+name;

        return str;

    }
}
