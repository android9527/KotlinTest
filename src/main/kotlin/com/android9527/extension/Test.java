package com.android9527.extension;

/**
 * Created by chenfeiyue on 2018/4/16.
 * Description:
 */
public class Test {

    public static boolean check(String name, String mobile, String id, int age) {
        return false;
    }

    public static boolean check(int age) {
        return check("", "", "", age);
    }

    public static boolean check(int age, String... args) {
        return false;
    }
}
