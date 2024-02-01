package com.atguigu4.search_sort.exer2;

public class BinarySearchTest {
    public static void main(String[] args) {
//        案例2：二分法查找
//
//        定义数组：int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
//        查找元素5是否在上述数组中出现过？如果出现，输出对应的索引值。
        int[] arr2 = new int[]{2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
        int head = 0; // 首索引
        int end = arr2.length - 1; // 尾索引
        int target = 19;
        int middle = -1;
        while (head <= end) {
            middle = (head + end) / 2;
            if (arr2[middle] == target) {
                System.out.println("找到" + target + "了!索引是" + middle);
                break;
            } else if (arr2[middle] < target) {
                head = ++middle;
            } else {
                end = --middle;
            }
            if (head > end) {
                System.out.println("没找到" + target + "!");
            }
        }

    }
}
