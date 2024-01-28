package com.atguigu3.common_algorithm.exer2;

public class ArrayExer02 {
    public static void main(String[] args) {
        /*案例：评委打分

        分析以下需求，并用代码实现：

（1）在编程竞赛中，有10位评委为参赛的选手打分，分数分别为：5,4,6,8,9,0,1,2,7,3

（2）求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）*/
        int[] scores = new int[]{5, 4, 6, 8, 9, 0, 1, 2, 7, 3};
        // 找出最大值和最小值和总和
        int max, min, total;
        max = min = scores[0];
        total = 0;
        for (int i : scores) {
            if (i > max)
                max = i;
            else if (i < min)
                min = i;
            total += i;
        }
        System.out.println("去掉最高分和最低分最后的平均分为：" + (total - min - max) * 1.0 / (scores.length - 2));
    }
}
