package com.example1.springdatajpa.Controller;

import com.example1.springdatajpa.Services.AlbumService;
import com.example1.springdatajpa.entity.Album;
import com.example1.springdatajpa.entity.SysUser;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/album")
public class AlbumController {
    @Resource
    private AlbumService albumService;

    @GetMapping("/list")
    public List<Album> getAlbums(){
        return albumService.getHotAlbums();
    }

    @GetMapping(value = "/{id}")
    public Album getOne(@PathVariable("id") Integer id){
        return albumService.findOne(id);
    }

}
