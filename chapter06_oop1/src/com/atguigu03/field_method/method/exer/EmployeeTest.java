package com.atguigu03.field_method.method.exer;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu03.field_method.method.exer
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/14 15:45
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.id = 1;
        e.name = "小狗";
        e.age = 25;
        e.salary = 1236.3;
        e.birthday.year = 1968;
        e.birthday.month = 6;
        e.birthday.day = 14;

        e.printInfo();
    }
}
