package com.org.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/4 18:16
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserB implements Serializable {
    private int id;
    private  String department;
    private List<UserA> usera;
}
