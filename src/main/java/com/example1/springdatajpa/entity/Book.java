package com.example1.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer writer;
    private String introduction;
}
