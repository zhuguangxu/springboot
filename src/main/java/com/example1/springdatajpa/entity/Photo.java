package com.example1.springdatajpa.entity;

import io.swagger.models.auth.In;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Photo {

    @Id
    @GeneratedValue
    private Integer id;
    private String photoName;
    private String photoAddress;

    public Photo(String photoName, String photoAddress) {
        this.photoName = photoName;
        this.photoAddress = photoAddress;
    }
    public Photo(){

    }
}
