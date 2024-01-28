package com.atguigu3.common_algorithm.exer1;

import java.util.Arrays;

public class ArrayExer01 {
    public static void main(String[] args) {
        /*案例：定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，总和，平均值，
        并输出出来。

        要求：所有随机数都是两位数：[10,99]
        提示：求[a,b]范围内的随机数： (int)(Math.random() * (b - a + 1)) + a;*/
        //1、创建数组
        int[] arr = new int[10];
        //2、动态地给数组赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
        }
        System.out.println(Arrays.toString(arr));
        int min, max, total;
        min = max = arr[0];
        total = 0;
        for (int j : arr) {
            if (j > max) {// 找出最大值
                max = j;
            } else if (j < min) {// 找出最小值
                min = j;
            }
            total += j;// 求出总和
        }
        System.out.println("最大值是：" + max + ",最小值是：" + min + ",平均值是：" + total * 1.0 / arr.length);
    }
}
