package com.example1.springdatajpa.Services.impl;

import com.example1.springdatajpa.Services.AlbumService;
import com.example1.springdatajpa.dao.AlbumRepository;
import com.example1.springdatajpa.entity.Album;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {
    @Resource
    private AlbumRepository albumRepository;

    @Override
    public List<Album> getHotAlbums(){
        return albumRepository.findHotAlbums();
    }

    @Override
    public Album findOne(Integer id) {
        return albumRepository.findById(id).get();
    }


}
