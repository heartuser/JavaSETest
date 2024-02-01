package com.atguigu4.search_sort.exer3;

import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
//        案例1：使用冒泡排序，实现整型数组元素的排序操作
//
//        比如：int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
