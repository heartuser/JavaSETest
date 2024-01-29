package com.atguigu4.search_sort.exer1;

/**
 * ClassName: ArrayExer01_1
 * Package: com.atguigu4.search_sort.exer1
 * Description:
 *
 * @Author 刘量
 * @Create 2024/1/29 19:14
 * @Version 1.0
 */
public class ArrayExer01_1 {
    /*案例1：数组的扩容:
    现有数组 int[] arr = new int[]{1,2,3,4,5};
    现将数组长度扩容1倍，并将10,20,30三个数据添加到arr数组中，如何操作？*/
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        // 数组扩容一倍
        // int[] arr2 = new int[arr.length * 2];
        // 或
        int[] arr2 = new int[arr.length << 1];
        // 赋值
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr.length - 1 + 1] = 10;
        arr2[arr.length - 1 + 2] = 20;
        arr2[arr.length - 1 + 3] = 30;
        // 将新数组的地址赋值给原来的数组变量
        arr = arr2;
        // 数组
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
