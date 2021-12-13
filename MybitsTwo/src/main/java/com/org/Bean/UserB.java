package com.org.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;


/**
 * @Author HP
 * @Date 2021/11/2 18:28
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@Data
//@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
//注意如果产生了继承，那么打印toString的时候，不会打印父类属性，所以我们要自己加上 @ToString(callSuper = true)
public class UserB  /**extends User */ implements Serializable {



    private int uid;
    private String department;

    @Override
    public String toString() {
        return "UserB{" +
                "uid=" + uid +
                ", department='" + department + '\'' +
                ", user=" + user +
                '}';
    }

    List<User> user;
}
