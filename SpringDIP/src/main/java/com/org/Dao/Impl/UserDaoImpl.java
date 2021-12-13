package com.org.Dao.Impl;

import com.org.Dao.UserDao;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Author HP
 * @Date 2021/11/6 11:12
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class UserDaoImpl implements UserDao {
    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private String[] arr;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;
    private Properties properties;
    public void add() {
        System.out.println("来到了UserDao中add");
    }
    public  void show(){
        System.out.println(Arrays.toString(this.arr));
        System.out.println(this.list);
        System.out.println(this.map);
        System.out.println(this.properties);
        System.out.println(this.set);

    }
}
