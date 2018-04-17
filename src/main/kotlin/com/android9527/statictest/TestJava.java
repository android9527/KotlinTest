package com.android9527.statictest;

/**
 * Created by chenfeiyue on 18/2/12.
 * Description:
 */
public class TestJava {
    public static void main(String[] args) {
        String tag = CompanionTest.TAG;
        ObjectTest.INSTANCE.test();
//        CompanionTest.Companion.getInstance();
        CompanionTest.getInstance();
    }
}
