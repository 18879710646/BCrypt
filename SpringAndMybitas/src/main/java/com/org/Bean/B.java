package com.org.Bean;

import lombok.*;

import java.io.Serializable;

/**
 * @Author HP
 * @Date 2021/11/6 13:40
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class B implements Serializable {
    private int id;
    private String role;
}
