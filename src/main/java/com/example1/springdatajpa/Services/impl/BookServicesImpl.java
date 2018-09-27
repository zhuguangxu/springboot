package com.example1.springdatajpa.Services.impl;

import com.example1.springdatajpa.Services.BookServices;
import com.example1.springdatajpa.dao.BookRepository;
import com.example1.springdatajpa.dao.UserRepository;
import com.example1.springdatajpa.entity.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServicesImpl implements BookServices {

    @Resource
    private BookRepository bookRepository;

    @Override
    public Book save(Book book) {

        return bookRepository.save(book);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Book insert(Book book) {

        return null;
    }

    @Override
    public List<Book> getAll() {

        return bookRepository.findAll();
    }

    @Override
    public Book get(int id) {
        return bookRepository.findById(id).get();
    }


}
