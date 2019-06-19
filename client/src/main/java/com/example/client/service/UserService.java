package com.example.client.service;

import com.example.client.entity.User;
import com.example.client.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> getList(User user) {
        List<User> list = userMapper.getList(user);
        return list;
    }
}
