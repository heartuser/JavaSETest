package com.atguigu4.search_sort.exer2;

public class LinearSearchTest {
    public static void main(String[] args) {
//        案例1：线性查找
//        定义数组：int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};
//        查找元素5是否在上述数组中出现过？如果出现，输出对应的索引值。
        int[] arr1 = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        int index = -1;
        int target = 5;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("找到" + target + "了！索引值是" + index);
        } else {
            System.out.println("没有" + target + "这个数字！");
        }
    }
}
