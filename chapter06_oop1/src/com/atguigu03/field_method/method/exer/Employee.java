package com.atguigu03.field_method.method.exer;

import com.atguigu03.field_method.field.exer2.MyDate;

/**
 * ClassName: Employee
 * Package: com.atguigu03.field_method.field.exer2
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/14 13:51
 * @Version 1.0
 */
public class Employee {
    public int id;// 编号
    public String name;// 姓名
    public int age;// 年龄
    public double salary;// 薪水
    public MyDate birthday = new MyDate();// 生日

    public void printInfo() {
        System.out.println("Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}');
    }
}
