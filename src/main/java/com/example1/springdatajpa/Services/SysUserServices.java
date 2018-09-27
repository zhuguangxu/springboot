package com.example1.springdatajpa.Services;

import com.example1.springdatajpa.entity.SysUser;

import java.util.List;

public interface SysUserServices {
    SysUser save(SysUser sysUser);

    List<SysUser> findAll();

    SysUser findOne(Integer id);

    SysUser findOneByAccount(String account);

    List<SysUser> findByPasswordLength(Integer length);

    List<SysUser> findOrderByFans(String nickname);

}
