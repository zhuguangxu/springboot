package com.example1.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 用@Entity注解标注本类是一个可持久化类
 * 用@Id注解指定主键
 * 用@GeneratedValue注解标注主键的策略，mysql为自增
 * 用@Data 注解
 * */
@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private  Integer userAdatar;

}
