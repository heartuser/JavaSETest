package com.atguigu03.field_method.method;

import java.util.Random;

/**
 * ClassName: MethodDefineDemo
 * Package: com.atguigu03.field_method.method
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/14 15:47
 * @Version 1.0
 */
public class MethodDefineDemo {
    /**
     * 无参无返回值方法的演示
     */
    public void sayHello() {
        System.out.println("Hello");
    }

    /**
     * 有参无返回值方法的演示
     *
     * @param length int 第一个参数，表示矩形的长
     * @param width  int 第二个参数，表示矩形的宽
     * @param sign   char 第三个参数，表示填充矩形图形的符号
     */
    public void printRectangle(int length, int width, char sign) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }

    /**
     * 无参有返回值方法的演示
     *
     * @return
     */
    public int getIntBetweenOneToHundred() {
        return (int) (Math.random() * 100 + 1);
    }

    /**
     * 有参有返回值方法的演示
     *
     * @param a int 第一个参数，要比较大小的整数之一
     * @param b int 第二个参数，要比较大小的整数之二
     * @return int 比较大小的两个整数中较大者的值
     */
    public int max(int a, int b) {
        return (a >= b) ? a : b;
    }
}
