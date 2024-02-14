package com.atguigu03.field_method.field.exer2;

/**
 * ClassName: MyDate
 * Package: com.atguigu03.field_method.field.exer2
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/14 13:48
 * @Version 1.0
 */
public class MyDate {
    public int year;// 年
    public int month;// 月
    public int day;// 日

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
}
