package com.example1.springdatajpa.dao;

import com.example1.springdatajpa.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface SysUserRepository extends JpaRepository<SysUser,Integer> {
    /**
     * 根据账号查
    *
     * */
    SysUser findByAccount(String account);

   List<SysUser> findByNicknameStartingWith(String nickname);

   List<SysUser> findByNicknameStartingWithAndFansAfter(String nickname,Integer fans);
}
