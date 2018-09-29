package com.example1.springdatajpa.Services.impl;

import com.example1.springdatajpa.Services.TopicService;
import com.example1.springdatajpa.dao.TopicRepository;
import com.example1.springdatajpa.entity.Topic;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ZGX
 */
@Service
public class TopicServiceImpl implements TopicService {

    @Resource
    private TopicRepository topicRepository;

    @Override
    public Topic findByName(String name) {
        return topicRepository.findByName(name);
    }
}
