package com.atguigu05.method_more._02args;

import java.util.Arrays;

/**
 * @author 尚硅谷-宋红康
 * @create 23:23
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest at = new ArgsTest();
        at.print(1,2);
    }
    public void print(int c, int ... ags){
        System.out.println(c);
        System.out.println(Arrays.toString(ags));
    }
}
