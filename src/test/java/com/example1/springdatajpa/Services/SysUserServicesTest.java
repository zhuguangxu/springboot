package com.example1.springdatajpa.Services;

import com.example1.springdatajpa.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServicesTest {

    @Resource
    private SysUserServices sysUserServices;


    @Test
    public void save() {
    }

    @Test
    public void findAll() {

    }

    @Test
    public void findOne() {
        SysUser sysUser = sysUserServices.findOne(23);
        System.out.println(sysUser);
    }

    @Test
    public void findOneByAccount() {
        SysUser sysUser = sysUserServices.findOneByAccount("aaa@qq.com");
        System.out.println(sysUser);
    }

    @Test
    public void findByPasswordLength() {
    }

    @Test
    public void findOrderByFans() {
    }
}