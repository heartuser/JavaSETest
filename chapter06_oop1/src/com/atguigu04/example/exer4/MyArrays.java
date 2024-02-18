package com.atguigu04.example.exer4;

/**
 * ClassName: MyArrays
 * Package: com.atguigu04.example.exer4
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/18 16:54
 * @Version 1.0
 */
public class MyArrays {
    //    根据上一章数组中的常用算法操作，自定义一个操作int[]的工具类。
//    涉及到的方法有：求最大值、最小值、总和、平均数、遍历数组、复制数组、数组反转、数组排序(默认从小到大排序)、查找等
    public void findMax(int[] arr) { // 找最大值
        if (arr != null && arr.length != 0) {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("最大值是" + max);
        } else {
            System.out.println("数组为空！");
        }
    }

    public void findMin(int[] arr) { // 找最小值
        if (arr != null && arr.length != 0) {
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("最小值是" + min);
        } else {
            System.out.println("数组为空！");
        }
    }

    public int total(int[] arr) { // 求总和
        if (arr != null && arr.length != 0) {
            int total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += arr[i];
            }
            System.out.println("总和为" + total);
            return total;
        } else {
            System.out.println("数组为空！");
            return arr[1];
        }
    }

    public void average(int[] arr) { //求平均值
        int total = total(arr);
        double average = 1.0 * total / arr.length;
        System.out.println("平均值是" + average);
    }

    public void show(int[] arr) {// 遍历数组
        if (arr != null && arr.length != 0) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i != arr.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        } else {
            System.out.println("数组为空！");
        }
    }

    public int[] copy(int[] arr) {// 复制数组
        if (arr != null && arr.length != 0) {
            int[] newArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            return newArr;
        } else {
            System.out.println("数组为空！");
            return new int[0];
        }
    }

    public void reverse(int[] arr) {// 数组翻转
        if (arr != null && arr.length != 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                arr[i] = arr[i] ^ arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = arr[i] ^ arr[arr.length - 1 - i];
                arr[i] = arr[i] ^ arr[arr.length - 1 - i];
            }
            show(arr);
        } else {
            System.out.println("数组为空！");
        }
    }

    public void sort(int[] arr) {// 数组排序，从小到大
        if (arr != null && arr.length != 0) {
            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        arr[j] = arr[j] ^ arr[j + 1];
                        arr[j + 1] = arr[j] ^ arr[j + 1];
                        arr[j] = arr[j] ^ arr[j + 1];
                    }
                }
            }
            show(arr);
        } else {
            System.out.println("数组为空！");
        }
    }

    /**
     * 使用线性的方法查找指定的元素
     * @param arr 待查找的数组
     * @param target 要查找的元素
     * @return 返回target在arr数组中的索引位置。若未找到，则返回-1
     */
    public int linearfind(int[] arr, int target) {// 查找，返回索引值,没找到返回-1
        if (arr != null && arr.length != 0) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == target){
                    return j;
                }
            }
            return -1;
        }else {
            System.out.println("数组为空！");
            return -1;
        }
    }
}
