package com.example1.springdatajpa.Services;

import com.example1.springdatajpa.entity.Topic;

/**
 * @author jzy
 */
public interface TopicService {

    /**
     * 根据话题名查找
     * @param name
     * @return
     */
    Topic findByName(String name);
}
