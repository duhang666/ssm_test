package com.dh.mybatis.mapper;

import com.dh.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> findAllUser() throws Exception;

    User findUserById(int id) throws Exception;

    void addUser(User user) throws Exception;
}