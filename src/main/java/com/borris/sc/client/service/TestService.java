package com.borris.sc.client.service;

import com.borris.sc.client.mapper.UserMapper;
import com.borris.sc.client.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserList() {
        return userMapper.selectAllUser();
    }
}
