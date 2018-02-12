package com.android9527;

import com.android9527.entity.People;
import com.android9527.extend.ExtendTestKt;

import java.math.BigDecimal;

/**
 * Created by chenfeiyue on 17/12/13.
 * Description:
 */
public class HelloWorldJava {

    public static void main(String[] args) {
        test();
    }

    private static void test(int... arg) {
        People people = new People("zhangsan", 19);
        people.copy("zhangsan", 19);

        // java 调用kotlin扩展函数
        System.out.println(ExtendTestKt.multiply("abc", 3));

        double d = 1.0d;

        float f = 1.0f;

//        String s = "abc".bd;
//        BigDecimal bd = ExtendTestKt.getBd("abc");

    }
}
