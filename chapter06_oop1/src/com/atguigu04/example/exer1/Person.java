package com.atguigu04.example.exer1;

/**
 * ClassName: Person
 * Package: com.atguigu04.example.exer1
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/17 14:33
 * @Version 1.0
 */
public class Person {
    String name;// 姓名
    int age;// 年龄
    String gender;// 性别

    public void study(){
        System.out.println("studying");
    }
    public int showAge(){
        return age;
    }
    public void addAge(int addAge){
        age += addAge;
    }
}
