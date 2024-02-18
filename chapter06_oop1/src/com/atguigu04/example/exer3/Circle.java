package com.atguigu04.example.exer3;

/**
 * ClassName: Circle
 * Package: com.atguigu04.example.exer3
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/18 16:47
 * @Version 1.0
 */
public class Circle {
    double radius;// 半径

    public void findArea() {
        System.out.println(Math.PI * radius * radius);
    }

    public void findArea1(double r) {
        System.out.println(Math.PI * r * r);
    }
}
