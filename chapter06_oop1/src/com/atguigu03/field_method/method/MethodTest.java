

package com.atguigu03.field_method.method;

import com.atguigu03.field_method.method.exer.Employee;

/**
 * @author 尚硅谷-宋红康
 * @create 19:01
 */
public class MethodTest {
    public static void main(String[] args) {
        MethodDefineDemo mdd = new MethodDefineDemo();
        mdd.sayHello();
        mdd.printRectangle(8,5,'#');
        System.out.println(mdd.getIntBetweenOneToHundred());
        System.out.println(mdd.max(10, 40));
    }
}

