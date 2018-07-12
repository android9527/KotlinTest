package com.android9527;

import com.android9527.entity.PeopleJava;
import com.android9527.extension.ExtensionTestKt;

/**
 * Created by chenfeiyue on 17/12/13.
 * Description:
 */
public class HelloWorldJava {

    public static void main(String[] args) {
        test();
    }

    private static void test(int... arg) {
        // java 调用kotlin扩展函数
        System.out.println(ExtensionTestKt.multiply("abc", 3));

        int i1 = 0x10000000;
        int i2 = 0x20000000;
        int i3 = 0x30000000;
        int i4 = 0x40000000;
        int i5 = 0x50000000;

        int i = i1 | i2 | i3;
        System.out.println(i);
        System.out.println(i & i1);
        System.out.println(i & i4);
        System.out.println(i & i5);

        PeopleJava p = new PeopleJava();
        HelloWorldKt.put(p.getName());
    }

}
