package com.org.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author HP
 * @Date 2021/11/8 22:23
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSmoney() {
        return smoney;
    }

    public void setSmoney(int smoney) {
        this.smoney = smoney;
    }

    public int getFmoney() {
        return fmoney;
    }

    public void setFmoney(int fmoney) {
        this.fmoney = fmoney;
    }

    private  int id;
    private  String name;
    private  int smoney;
    private int fmoney;
}
