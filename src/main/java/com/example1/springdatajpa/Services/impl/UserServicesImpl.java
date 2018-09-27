package com.example1.springdatajpa.Services.impl;

import com.example1.springdatajpa.Services.UserServices;
import com.example1.springdatajpa.dao.UserRepository;
import com.example1.springdatajpa.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServicesImpl implements UserServices {

    /**1.用@Services注解标注本类对象为Services层的bean
     * 2.用@Resource注解标注dao层的bean userServices
     * 3.
     */
    @Resource
    private UserRepository userRepository;

    @Override
    @Transactional
    public User save(User user) {
        return  userRepository.save(user);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAll() {
       return userRepository.findAll();
    }

    @Override
    public User get(int id) {
        return userRepository.findById(id).get();
    }


}
