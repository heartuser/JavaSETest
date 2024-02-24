package com.atguigu05.method_more._01overload.exer;

/**
 * ClassName: Test2
 * Package: com.atguigu05.method_more._01overload.exer
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/21 16:17
 * @Version 1.0
 */
public class Test2 {
    /*练习2：
    编写程序，定义三个重载方法并调用。方法名为mOL。
    三个方法分别接收一个int参数、两个int参数、一个字符串参数。
    分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。*/
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.mOL(3);
        test2.mOL(2, 7);
        test2.mOL("Hello");
    }

    public void mOL(int i) {
        System.out.println("平方为：" + i * i);
    }

    public void mOL(int i, int j) {
        System.out.println("相乘的结果为：" + i * j);
    }

    public void mOL(String s) {
        System.out.println(s);
    }
}
