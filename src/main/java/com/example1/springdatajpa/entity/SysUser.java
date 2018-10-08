package com.example1.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.BatchUpdateException;

@Entity
@Data
public class SysUser implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String account;

    @Column(nullable = false)
    private String password;

    private String nickname;

    private Integer fans;

    public SysUser() {

    }

    public SysUser(String account, String password, String nickname, Integer fans) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.fans = fans;
    }
}
