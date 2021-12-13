package com.org.bean;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author HP
 * @Date 2021/10/30 13:51
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class User implements Serializable {
    private int uid;

    public User(String username, String sex, Date birthday, String address) {
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
    }

    public User(String username) {
        this.username = username;
    }

    public User() {
    }

    public User(int uid) {
        this.uid = uid;
    }

    public User(int uid, String username) {
        this.uid = uid;
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }

    private  String username;

    public User(int uid, String username, String sex, Date birthday, String address) {
        this.uid = uid;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
    }

    private String sex;
    private Date birthday;
    private String address;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
