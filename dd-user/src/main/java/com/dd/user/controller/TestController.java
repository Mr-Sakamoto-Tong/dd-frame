package com.dd.user.controller;

import com.dd.user.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("/test")
    public String test(){
//        return "hello dd";
        return userMapper.getTest().getAge().toString();
    }
}
