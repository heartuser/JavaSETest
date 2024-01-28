package com.atguigu3.common_algorithm;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n % 2 == 0) {
            System.out.println("请输入奇数边长！");
            return;
        }

        int[][] matrix = generateSpiralMatrix(n);

        // 打印生成的螺旋矩阵
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int row = 0, col = 0;

        // 定义四个方向的坐标变化
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0; // 当前方向

        while (num <= n * n) {
            matrix[row][col] = num++;
            int nextRow = row + directions[dir][0];
            int nextCol = col + directions[dir][1];

            // 判断下一个位置是否越界或已经被访问
            if (nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < n && matrix[nextRow][nextCol] == 0) {
                row = nextRow;
                col = nextCol;
            } else {
                // 方向变化，顺时针旋转
                dir = (dir + 1) % 4;
                row += directions[dir][0];
                col += directions[dir][1];
            }
        }

        return matrix;
    }
}
