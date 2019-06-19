package com.example.client.controller;

import com.example.client.entity.User;
import com.example.client.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping
    public String hello() {
        return "Hello Spring-Boot";
    }

    @RequestMapping("/list.do")
    public List<User> getList(User user) {
        List<User> list = new ArrayList<>();
        list = userService.getList(user);
        return list;
    }

}
