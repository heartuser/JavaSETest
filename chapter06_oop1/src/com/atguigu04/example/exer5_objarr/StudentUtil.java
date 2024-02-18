package com.atguigu04.example.exer5_objarr;

/**
 * ClassName: StudentUtil
 * Package: com.atguigu04.example.exer5_objarr
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/18 19:23
 * @Version 1.0
 */
public class StudentUtil {
    public void printStudentsWithState(Student[] students, int state){ // 显示指定班级的学生
        System.out.println(state + "年级的学生有：");
        for (Student s : students) {
            if (s.state == state) {
                System.out.println("学号：" + s.number + "，年级：" + s.state + "，成绩：" + s.score);
            }
        }
    }
    public void sort(Student[] students){// 对学生进行排序
        for (int i = students.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (students[j].score < students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public void printStudents(Student[] students){// 显示所有学生信息
        for (Student s : students) {
            System.out.println("学号：" + s.number + "，年级：" + s.state + "，成绩：" + s.score);
        }
    }
}
