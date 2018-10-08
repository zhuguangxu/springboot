package com.example1.springdatajpa.Services.impl;

import com.example1.springdatajpa.Services.BookServices;
import com.example1.springdatajpa.entity.Book;
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
public class BookServicesImplTest {

    @Resource
    private BookServices bookServices;

    @Test
    public void save() {
        String[] names = {"JAVA笔记大全", "Android笔记大全", "数据结构笔记大全", "软件工程笔记大全", "CSS笔记大全"};
        String[] intros = {"java日常学习，可以用于日常复习", "日常学习，可以用于日常复习", "日常学习，可以用于日常复习", "日常学习，可以用于日常复习", "日常学习，可以用于日常复习"};
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Book book = new Book();
            book.setName(names[i]);
            book.setWriter(random.nextInt(30));
            book.setIntroduction(intros[i]);
            System.out.println(bookServices.save(book));
        }

    }

    @Test
    public void delete() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void get() {
    }
}