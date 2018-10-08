package com.example1.springdatajpa.Services.impl;

import com.example1.springdatajpa.Services.AlbumService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumServiceImplTest {

    @Resource
    private AlbumService albumService;

    @Test
    public void findOne() {
        System.out.println(albumService);
    }
}