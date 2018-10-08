package com.example1.springdatajpa.dao;

import com.example1.springdatajpa.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserRepositoryTest {
    @Resource
    private SysUserRepository sysUserRepository;

    @Test
    public void save() {
        SysUser[] users = {
                new SysUser("aaa@qq.com", "111", "简书大", 999),
                new SysUser("bbb@qq.com", "222", "简书二", 895),
                new SysUser("ccc@qq.com", "333", "简书老三", 99),
                new SysUser("ddd@qq.com", "444", "简书老四", 959),
                new SysUser("eee@qq.com", "555", "简书老五", 258),
                new SysUser("fff@qq.com", "666", "简书老六", 298)

        };
        for (int i = 0; i < users.length; i++) {
            sysUserRepository.save(users[i]);
        }

    }


    @Test
    public void findByAccount() {
        SysUser sysUser = sysUserRepository.findByAccount("aaa@qq.com");
        System.out.println(sysUser);

    }

    @Test
    public void findByNicknameStartingWith() {
        List<SysUser> list = sysUserRepository.findByNicknameStartingWith("简");
        System.out.println(list);
    }

    @Test
    public void findByNicknameStartingWithAndFansAfter() {
        List<SysUser> list = sysUserRepository.findByNicknameStartingWithAndFansAfter("简书", 959);
        System.out.println(list);
    }

    @Test
    public void findUser() {
        SysUser sysUser = sysUserRepository.findUser("简书老大");
        System.out.println(sysUser);
    }

    @Test
    public void findUsers() throws Exception {
        List<SysUser> list = sysUserRepository.findUsers("简书老");
        System.out.println(list);
    }
}