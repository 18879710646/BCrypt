package com.itheima.POJO;

import java.io.Serializable;

public class User implements Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Addess getAddess() {
        return addess;
    }

    public void setAddess(Addess addess) {
        this.addess = addess;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", addess=" + addess +
                '}';
    }

    private  String name;
    private int age;
    private int money;
    private  Addess addess;
}
