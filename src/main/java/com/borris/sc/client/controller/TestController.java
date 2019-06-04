package com.borris.sc.client.controller;

import com.borris.sc.client.pojo.User;
import com.borris.sc.client.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/method1")
    public String method1(String str){
        System.out.println(" method in ");
        return "first method on spring cloud , nice to meet you "+str;
    }

    @RequestMapping("/getUserList")
    public List<User> getUserList(){
        return testService.getUserList();
    }
}
