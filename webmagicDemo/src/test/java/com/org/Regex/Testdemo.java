package com.org.Regex;

import java.util.Scanner;

/**
 * @Author HP
 * @Date 2021/12/6 14:20
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

/**
 * . 表示为匹配任意字符，如果要写入.那么\.
 * \d  表示为匹配任意数字
 * \D  任何非数字
 * \s  匹配空格
 * \S  任意非空格
 * \w  匹配任意字母
 * \W  任何非字母
 *
 */
public class Testdemo {
//    - QQ号码必须是5--15位长度
//- 而且必须全部是数字
//- 而且首位不能为0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String qq = scanner.next();
        System.out.println(checkQQ(qq));
    }
    private static boolean checkQQ(String qq){
        String regex="\\w";
        return qq.matches(regex);
    }
}
