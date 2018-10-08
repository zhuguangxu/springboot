package com.example1.springdatajpa.Services.impl;

import com.example1.springdatajpa.Services.UserServices;
import com.example1.springdatajpa.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Random;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServicesImplTest {
    @Resource
    private UserServices userServices;

    @Test
    public void save() {
        String[] names = {"aa", "bb", "cc", "dd", "ee"};
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setUserName(names[i]);
            user.setUserAdatar(random.nextInt(30));
            System.out.println(userServices.save(user));

        }

    }

    @Test
    public void getAll() {


    }

    @Test
    public void get() {


    }

    @Test
    public void delete() {

    }
}