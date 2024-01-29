package com.atguigu3.common_algorithm;

import java.util.Scanner;

public class 回形数 {
    public static void main(String[] args) {
        /*
         * bian：边长
         * quan：圈数,从零开始
         * [quan][quan]:每一圈的左上角
         * [quan][bian-1-quan]:每一圈的右上角
         * [bian-1-quan][bian-1-quan]:每一圈的右下角
         * [bian-1-quan][quan]:每一圈的左下角
         * */
        int bian = 0;
        Scanner sc = new Scanner(System.in);
        bian = sc.nextInt();
        sc.close();
        int[][] hui = new int[bian][bian];
        for (int i = 1, quan = 0; i <= bian * bian; quan++) {
            for (int j = quan; j < bian - quan; j++) {
                hui[quan][j] = i++;
            }
            for (int j = quan + 1; j < bian - quan; j++) {
                hui[j][bian - 1 - quan] = i++;
            }
            for (int j = bian - 2 - quan; j >= quan; j--) {
                hui[bian - 1 - quan][j] = i++;
            }
            for (int j = bian - 2 - quan; j > quan; j--) {
                hui[j][quan] = i++;
            }
        }
        for (int[] ints : hui) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}
