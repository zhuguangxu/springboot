package com.example1.springdatajpa.Controller;

import com.example1.springdatajpa.Services.SysUserServices;
import com.example1.springdatajpa.entity.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class SysUserController {
    @Resource
    private SysUserServices sysUserServices;

    @GetMapping(value = "/all")
    public List<SysUser> findAll() {
        return sysUserServices.findAll();
    }


    @GetMapping(value = "/oneId/{id}")
    public SysUser getOne(@PathVariable("id") Integer id) {
        return sysUserServices.findOne(id);
    }

    @GetMapping(value = "/account/{account}")
    public SysUser getOneByNickname(@PathVariable("account") String account) {
        return sysUserServices.findOneByAccount(account);
    }


    @GetMapping(value = "/nickname/{nickname}")
    public List<SysUser> findOrderByFans(@PathVariable("nickname") String nickname) {
        return sysUserServices.findOrderByFans(nickname);
    }
}
