package com.atguigu03.field_method.field.exer1;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu03.field_method.field.exer1
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/14 13:25
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.age = 20;
        e1.name = "小明";
        e1.id = 1;
        e1.salary = 2000;

        Employee e2= new Employee();
        e2.age = 25;
        e2.name = "小红";
        e2.id = 2;
        e2.salary = 2300;

        System.out.println(e1);
        System.out.println(e2);
    }
}
