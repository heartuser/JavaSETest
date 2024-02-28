package com.atguigu05.method_more._04recursion;

/**
 * @author 尚硅谷-宋红康
 * @create 16:57
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest r = new RecursionTest();
        System.out.println(r.getSum(100));
        System.out.println(r.getMul(5));
        System.out.println(r.f(10));
    }

    public int getSum(int num) {// 递归计算1到100的和
        if (num == 1) {
            return 1;
        } else {
            return getSum(num - 1) + num;
        }
    }

    public int getMul(int num) {// 计算n!
        if (num == 1) {
            return 1;
        } else {
            return getMul(num - 1) * num;
        }
    }

    public int f(int n) {// 斐波那契数列
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
