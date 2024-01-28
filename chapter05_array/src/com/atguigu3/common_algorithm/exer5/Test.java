package com.atguigu3.common_algorithm.exer5;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[i] ^ arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i] ^ arr[arr.length - 1 - i];
            arr[i] = arr[i] ^ arr[arr.length - 1 - i];
        }
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
