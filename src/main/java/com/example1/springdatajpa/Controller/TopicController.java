package com.example1.springdatajpa.Controller;

import com.example1.springdatajpa.Services.TopicService;
import com.example1.springdatajpa.entity.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ZGX
 */
@RestController
@RequestMapping(value = "/topic")
public class TopicController {

    @Resource
    private TopicService topicService;

    @GetMapping()
    public Topic getTopicByName(String name) {
        return topicService.findByName(name);
    }
}
