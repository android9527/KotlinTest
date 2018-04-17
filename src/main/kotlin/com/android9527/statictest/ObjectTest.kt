package com.android9527.statictest

import com.android9527.interfacetest.IDriver
import java.util.*

/**
 * Created by chenfeiyue on 18/2/6.
 * Description:
 */

/**
 * 对象声明是定义单例的一种形式
 * object class 等同于java 饿汉式单例
 * public static final ObjectTest INSTANCE = new ObjectTest();
 */
object ObjectTest : ArrayList<String>() {
    fun test() {
    }
}