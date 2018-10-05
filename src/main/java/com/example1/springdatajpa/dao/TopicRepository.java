package com.example1.springdatajpa.dao;


import com.example1.springdatajpa.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic,Integer> {

    /**
     * 按照话题名查找
     * @param name
     * @return
     */
    Topic findByName(String name);
}
