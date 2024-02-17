package com.atguigu04.example.exer2;

/**
 * ClassName: Test
 * Package: com.atguigu04.example.exer2
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/17 14:51
 * @Version 1.0
 */
public class Test {
    //    1.编写程序，声明一个method1方法，在方法中打印一个10*8 的*型矩形，在main方法中调用该方法。
//    2. 编写程序，声明一个method2方法，除打印一个10*8的*型矩形外，
//    再计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
//    3. 编写程序，声明一个method3方法，在method3方法提供m和n两个参数，方法中打印一个m*n的*型矩形，
//    并计算该矩形的面积，将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
    public static void main(String[] args) {
        Test t = new Test();
        t.method1();
        System.out.println("---------------------------");
        System.out.println(t.method2());
        System.out.println("---------------------------");
        System.out.println(t.method3(5, 3));
    }

    public void method1() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int method2() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 8 * 10;
    }

    public int method3(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m * n;
    }
}
