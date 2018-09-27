package com.example1.springdatajpa.Services.impl;

import com.example1.springdatajpa.Services.SysUserServices;
import com.example1.springdatajpa.dao.SysUserRepository;
import com.example1.springdatajpa.entity.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServicesImpl implements SysUserServices {

@Resource
private SysUserRepository sysUserRepository;
    @Override
    public SysUser save(SysUser sysUser) {
        return null;
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserRepository.findAll();
    }

    @Override
    public SysUser findOne(Integer id) {
        return sysUserRepository.findById(id).get();
    }

    @Override
    public SysUser findOneByAccount(String account) {
        return sysUserRepository.findByAccount(account);
    }

    @Override
    public List<SysUser> findByPasswordLength(Integer length) {
        return sysUserRepository.findByPasswordLessThan(length);
    }

    @Override
    public List<SysUser> findOrderByFans(String nickname) {
        return sysUserRepository.findUsers(nickname);
    }
}
