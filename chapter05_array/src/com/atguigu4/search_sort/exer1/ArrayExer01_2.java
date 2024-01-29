package com.atguigu4.search_sort.exer1;

/**
 * ClassName: ArrayExer01_2
 * Package: com.atguigu4.search_sort.exer1
 * Description:
 *
 * @Author 刘量
 * @Create 2024/1/29 19:42
 * @Version 1.0
 */
public class ArrayExer01_2 {
    /*案例：数组的缩容：
    现有数组 int[] arr={1,2,3,4,5,6,7}。现需删除数组中索引为4的元素。 */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // 设置要删除的数字索引
        int index = 4;
        // 删除
        for (int i = index; i < arr.length; i++) {
            if (i != arr.length - 1 && arr[i] != arr[i + 1])
                arr[i] = arr[i + 1];
            else if (arr[i] != 0)
                arr[i] = 0;
        }
        // 遍历
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
