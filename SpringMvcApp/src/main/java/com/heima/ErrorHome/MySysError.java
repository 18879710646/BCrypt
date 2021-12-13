package com.heima.ErrorHome;

/**
 * @Author HP
 * @Date 2021/10/23 12:58
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

// 自定义异常
public class MySysError  extends RuntimeException{
    public  MySysError(String message){
        super(message);
    }
}
