package com.android9527.extend

import java.math.BigDecimal

/**
 * Created by chenfeiyue on 17/12/13.
 * Description: 函数扩展、属性扩展、运算符重载
 */
fun main(args: Array<String>) {
    val string = "abc"
    println(string.isEmpty())

    println(string.multiply(3))
//    println(string times 3)
//    println(string * 3)

    val a = "11".bd
    val b = BigDecimal(22)

    println(a.add(b))
}

/**
 * String 函数扩展
 * // java 调用kotlin扩展函数
 * ExtendTestKt.multiply("abc", 3)
 */
fun String.multiply(int: Int): String {
    val stringBuffer = StringBuffer()
    for (i in 0 until int) {
        stringBuffer.append(this)
    }
    return stringBuffer.toString()
}

//operator infix fun String.times(int: Int): String {
//    val stringBuffer = StringBuffer()
//    for (i in 0 until int) {
//        stringBuffer.append(this)
//    }
//    return stringBuffer.toString()
//}


/**
 * java 调用扩展成员相当于调用静态方法
 *
 * ExtendTestKt.getBd("abc")
 */
val String.bd: BigDecimal
    get() = BigDecimal(this)
//    set(value) {}







