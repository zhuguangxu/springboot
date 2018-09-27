package com.example1.springdatajpa.Controller;

import com.example1.springdatajpa.Services.UserServices;
import com.example1.springdatajpa.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserServices userServices;

    @GetMapping("/all")
    public List<User> getAll(){
        return userServices.getAll();
    }


    @GetMapping("/{id}")
    public User get(@PathVariable Integer id){
        return userServices.get(id);
    }

//    @GetMapping("/{id}")
//    public User delete(@PathVariable Integer id){
//         userServices.delete(id);
//    }





}
