package com.borris.sc.client.mapper;

import com.borris.sc.client.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    void selectByPrimaryKey(String s);

    void deleteByPrimaryKey(String s);

    void insert(User user);

    void insertUser(User user);

    void updatePassword(User user);

    List<User> selectAllUser();
}
