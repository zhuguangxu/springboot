package com.example1.springdatajpa.dao;

import com.example1.springdatajpa.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo,Integer> {
}
