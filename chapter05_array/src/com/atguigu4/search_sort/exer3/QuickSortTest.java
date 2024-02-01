package com.atguigu4.search_sort.exer3;

import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
//        案例1：使用冒泡排序，实现整型数组元素的排序操作
//        比如：int[] date = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        int[] date = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67, 1};
        quickSort(date, 0, date.length - 1);
        System.out.println(Arrays.toString(date));
    }

    private static void quickSort(int[] date, int start, int end) {
        // start、end遍历范围的两端
        if (start > end) {
            return;
        } else {
            int base = date[start];
            int low = start;
            int high = end;
            while (true) {
                // 从前到后遍历
                while (low < end && date[++low] > base) ;
                while (high > start && date[--high] < base) ;
                if (low < high)
                    swap(date, low, high);
                else
                    break;
            }
            // 交换start和high之间的数字
            swap(date, start, high);
            // 再处理前后两段
            quickSort(date, 0, high - 1);
            quickSort(date, high + 1, end);
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        arr[index1] = arr[index1] ^ arr[index2];
        arr[index2] = arr[index1] ^ arr[index2];
        arr[index1] = arr[index1] ^ arr[index2];
    }

    ;
}
