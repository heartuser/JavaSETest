package com.atguigu05.method_more._02args.exer;

/**
 * ClassName: Test
 * Package: com.atguigu05.method_more._02args.exer
 * Description:
 *
 * @Author 刘量
 * @Create 2024/2/21 17:38
 * @Version 1.0
 */
public class Test {
    /*练习：可变形参的方法
    n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""*/
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.concat("-", "Hello", "World", "123"));
    }

    public String concat(String operate, String... ags) {
        String s = "";
        for (int i = 0; i < ags.length; i++) {
            s += ags[i];
            if (i != ags.length - 1) {
                s += operate;
            }
        }
        return s;
    }
}
