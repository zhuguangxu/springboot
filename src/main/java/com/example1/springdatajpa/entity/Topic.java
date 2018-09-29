package com.example1.springdatajpa.entity;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Topic {

    @GeneratedValue
    @Id
    private Integer id;
    private String name;


    @OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.REMOVE)
    @JoinColumn(name = "topic_id")
    private List<Article> articles = new ArrayList<>();

    public Topic(String name) {
        this.name = name;
    }
}
