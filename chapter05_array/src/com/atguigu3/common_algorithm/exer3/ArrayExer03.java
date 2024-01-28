package com.atguigu3.common_algorithm.exer3;

import java.util.Arrays;

public class ArrayExer03 {
    public static void main(String[] args) {
        /*案例：使用二维数组打印一个 10 行杨辉三角。

   提示：
   1. 第一行有 1 个元素, 第 n 行有 n 个元素
   2. 每一行的第一个元素和最后一个元素都是 1
   3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
   yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];*/
        // 生成空数组
        int[][] yanghui = new int[10][];
        // 赋值
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];// 生成每一行的数组
            yanghui[i][0] = yanghui[i][i] = 1;//每行的第一个和最后一个元素都为1
            for (int j = 1; j < i; j++) {
                yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];// 给中间的数据赋值
            }
        }
        // 遍历二维数组
        for (int[] ints : yanghui) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
