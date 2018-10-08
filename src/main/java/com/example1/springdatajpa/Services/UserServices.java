package com.example1.springdatajpa.Services;

import com.example1.springdatajpa.entity.User;

import java.util.List;


public interface UserServices {

    /***
     * 新增
     */

    User save(User user);

    /**
     * @return
     */
    List<User> getAll();

    User get(int id);

    void delete(int id);
}
