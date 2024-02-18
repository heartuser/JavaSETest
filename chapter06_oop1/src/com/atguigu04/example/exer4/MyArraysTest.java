package com.atguigu04.example.exer4;

/**
 * ClassName: MyArraysTest
 * Package: com.atguigu04.example.exer4
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/18 17:43
 * @Version 1.0
 */
public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = {1, 6, 35, 24, 12, 8, 9, 0, 84, 18};
        MyArrays ma = new MyArrays();
        ma.findMax(arr);
        ma.findMin(arr);
        ma.total(arr);
        ma.average(arr);
        ma.show(arr);
        ma.reverse(arr);
        ma.sort(arr);
        System.out.println(ma.linearfind(arr, 12));
    }
}
