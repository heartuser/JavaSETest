package com.atguigu05.method_more._01overload.exer;

/**
 * ClassName: Test3
 * Package: com.atguigu05.method_more._01overload.exer
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/21 16:22
 * @Version 1.0
 */
public class Test3 {
    /* 练习3：
    定义三个重载方法max()：
    第一个方法求两个int值中的最大值，
    第二个方法求两个double值中的最大值，
    第三个方法求三个double值中的最大值，并分别调用三个方法。*/
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.max(4, 6);
        test3.max(5.2, 5.9);
        test3.max(2.1, 0.3, 3.4);
    }

    public void max(int i, int j) {
        int max = i > j ? i : j;
        System.out.println("最大值为" + max);
    }

    public double max(double a, double b) {
        double max = a > b ? a : b;
        System.out.println("最大值为" + max);
        return max;
    }

    public void max(double a, double b, double c) {
        double max1 = max(a, b);
        double max = max(max1, c);
//        if (max > b) {
//            if (max < c) {
//                max = c;
//            }
//        } else {
//            if (b < c) {
//                max = c;
//            } else {
//                max = b;
//            }
//        }
        System.out.println("最大值为" + max);
    }
}
