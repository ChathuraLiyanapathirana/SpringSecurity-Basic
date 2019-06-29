package com.appcitor.test.swsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by linuxlite on 6/27/19.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String sayHello() {
        return "hello.jsp";
    }
}
