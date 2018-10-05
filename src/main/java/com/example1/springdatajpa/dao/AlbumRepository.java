package com.example1.springdatajpa.dao;

import com.example1.springdatajpa.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album,Integer> {

    /**
     * 自定义查询，得到按照相册的喜欢数降序排列
     */
    @Query("FROM Album  a ORDER BY a.likes DESC ")
    List<Album> findHotAlbums();


}
