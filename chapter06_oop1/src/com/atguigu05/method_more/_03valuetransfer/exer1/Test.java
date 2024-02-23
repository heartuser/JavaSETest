package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * ClassName: Test
 * Package: com.atguigu05.method_more._03valuetransfer.exer1
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/23 13:42
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        PassObject po = new PassObject();
        po.printAreas(c, 10);
    }
}
