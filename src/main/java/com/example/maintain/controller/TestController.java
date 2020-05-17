package com.example.maintain.controller;

import com.example.maintain.bean.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    RetResult retResult;

    @RequestMapping("/test")
    public RetResult testController() {
        return retResult;
    }
}
