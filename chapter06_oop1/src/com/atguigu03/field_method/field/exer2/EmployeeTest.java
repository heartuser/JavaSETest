package com.atguigu03.field_method.field.exer2;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu03.field_method.field.exer2
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/14 13:55
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "熊大";
        e1.age = 33;
        e1.salary = 2536.5;
        e1.birthday.year = 1991;
        e1.birthday.month = 5;
        e1.birthday.day = 29;

        Employee e2 = new Employee();
        e2.id = 1;
        e2.name = "熊二";
        e2.age = 29;
        e2.salary = 2456.5;
        e2.birthday.year = 1995;
        e2.birthday.month = 7;
        e2.birthday.day = 12;

        System.out.println(e1);
        System.out.println(e2);
    }
}
