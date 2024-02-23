package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * ClassName: PassObject
 * Package: com.atguigu05.method_more._03valuetransfer.exer1
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/23 13:37
 * @Version 1.0
 */
public class PassObject {
    public void printAreas(Circle c, int time){
        System.out.println("radius\t\tArea");
        for (int i = 1; i <= time ; i++) {
            c.radius = i;
            System.out.println(i + "\t\t" + c.findArea());
        }
    }
}
