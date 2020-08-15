package com.example.demo.com.atguigu.test;

import java.util.Arrays;
import java.util.List;

/**
 * sorted()不传递参数的话直接是从小到大排序
 *
 */
public class Test {
    public static void main(String[] args) {
        List <Integer> list= Arrays.asList(45,3,6,48,46);
        list.stream()
                .filter(num->{return num>40;})
                .sorted()
                .forEach(System.out::println);
        System.out.println("玩个蛇皮");
    }
}
