package com.atguigu04.example.exer1;

/**
 * ClassName: PersonTest
 * Package: com.atguigu04.example.exer1
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/17 14:37
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "小明";
        p1.addAge(12);
        p1.gender = "男";
        p1.addAge(3);

        System.out.println(p1.showAge());
        p1.study();
    }
}
