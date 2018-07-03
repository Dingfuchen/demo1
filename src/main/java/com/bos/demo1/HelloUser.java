package com.bos.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloUser {

    @Autowired
    TestProperties testProperties;

    @GetMapping("/hello.html")
    @ResponseBody
    public  String say() {
        testProperties.printAppName();
        return "HELLO";
    }
}
