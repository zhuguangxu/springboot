package com.example1.springdatajpa.Services.impl;

import com.example1.springdatajpa.Services.SspService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SspServiceImplTest {

    @Resource
    private SspService sspService;
    @Test
    public void save() {

    }

    @Test
    public void getAll() {
        System.out.println(sspService.getAll());
    }

    @Test
    public void get() {
        System.out.println(sspService.get(3));
    }
}