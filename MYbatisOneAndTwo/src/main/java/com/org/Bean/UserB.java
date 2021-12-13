package com.org.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author HP
 * @Date 2021/11/3 16:08
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserB implements Serializable {
    @Override
    public String toString() {
        return "UserB{" +
                "uid=" + uid +
                ", department='" + department + '\'' +
                ", userA=" + userA +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public UserA getUserA() {
        return userA;
    }

    public void setUserA(UserA userA) {
        this.userA = userA;
    }

    private int uid;
    private String department;
    private UserA userA;
}
