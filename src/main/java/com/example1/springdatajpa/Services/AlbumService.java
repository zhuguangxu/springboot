package com.example1.springdatajpa.Services;

import com.example1.springdatajpa.entity.Album;

import java.util.List;

public interface AlbumService {
    /**
     * 按相册喜欢数获取热门相册
     *
     * @return
     */
    List<Album> getHotAlbums();

    Album findOne(Integer id);
}
