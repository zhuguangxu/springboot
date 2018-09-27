package com.example1.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Ssp {

    @Id
    @GeneratedValue
    private Integer id;
    private String avatar;
    private String writer;
    private String time;
    private String title;
    private String content;
    private String logo;
    private Integer number1;
    private Integer number2;

}
