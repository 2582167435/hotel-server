package com.hotel.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {
    @RequestMapping("/t")
    @ResponseBody
    public String t(){
        return "123";
    }
}
