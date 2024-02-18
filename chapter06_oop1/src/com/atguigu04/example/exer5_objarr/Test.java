package com.atguigu04.example.exer5_objarr;

/**
 * ClassName: Test
 * Package: com.atguigu04.example.exer5_objarr
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/18 18:30
 * @Version 1.0
 */
public class Test {
    /*
    1）定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
    2）创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
    问题一：打印出3年级(state值为3）的学生信息。
    问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
     */
    public static void main(String[] args) {
        // 创建20个学生并赋值
        Student[] ts = new Student[20];
        for (int i = 0; i < ts.length; i++) {
            ts[i] = new Student();
            ts[i].number = i + 1;
            ts[i].state = (int) (Math.random() * 6 + 1);
            ts[i].score = (int) (Math.random() * 101);
        }
        StudentUtil su = new StudentUtil();
        // 显示3年级的学生信息
        su.printStudentsWithState(ts,3);
        System.out.println("--------------------------------");
        // 把学生按成绩排序
        su.sort(ts);
        // 遍历排序后的学生成绩
        su.printStudents(ts);
    }
}
