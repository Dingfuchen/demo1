package com.bos.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloUser {

    @GetMapping("/hello.html")
    @ResponseBody
    public  String say() {
        return "HELLO";
    }
}
