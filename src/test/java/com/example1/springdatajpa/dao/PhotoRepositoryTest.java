package com.example1.springdatajpa.dao;

import com.example1.springdatajpa.entity.Album;
import com.example1.springdatajpa.entity.Photo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhotoRepositoryTest {

    @Resource
    private PhotoRepository photoRepository;

    @Test
    public void initData() {
        Photo[] photos = {
                new Photo("https://goo.gl/BDDpoY", "https://goo.gl/BDDpoY"),
                new Photo("https://goo.gl/vJtTNd", "https://goo.gl/vJtTNd"),
                new Photo("https://goo.gl/hKCVE5", "https://goo.gl/hKCVE5"),
                new Photo("https://goo.gl/Xsa7Sq", "https://goo.gl/Xsa7Sq"),
                new Photo("https://goo.gl/7QAxDA", "https://goo.gl/7QAxDA"),
                new Photo("https://goo.gl/wwaJE4", "https://goo.gl/wwaJE4"),
                new Photo("https://goo.gl/AtvjbD", "https://goo.gl/AtvjbD"),
                new Photo("https://goo.gl/MH7jFM", "https://goo.gl/MH7jFM")
        };
        for (int i = 0; i < photos.length; i++) {
            photoRepository.save(photos[i]);
        }
    }
}