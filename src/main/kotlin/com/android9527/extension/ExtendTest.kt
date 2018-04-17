package com.android9527.extension

import java.math.BigDecimal

/**
 * Created by chenfeiyue on 17/12/13.
 * Description: 函数扩展、属性扩展、运算符重载
 *
 * 函数还可以⽤中缀表⽰法调⽤， 当同时符合以下条件
 * 是成员函数或扩展函数；
 * 只有⼀个参数；
 * ⽤ infix 关键字标注。
 */
fun main(args: Array<String>) {
    val string = "abc"
    println(string.isNotEmpty())
    println(string.multiply(3))
    println(string multiply 3)

//    println(string.times(3))
//    println(string * 3)

    val a = "11".bd
    val b = BigDecimal(22)

    println(a.add(b))
}

/**
 * String 函数扩展
 * java 调用kotlin扩展函数
 * ExtendTestKt.multiply("abc", 3)
 */
infix fun String.multiply(time: Int): String {
    val stringBuffer = StringBuffer()
    for (i in 0 until time) {
        stringBuffer.append(this)
    }
    return stringBuffer.toString()
}

operator infix fun String.times(time: Int): String {
    return this.multiply(time)
}

/**
 * 如果一个扩展函数和成员函数有相同的签名，成员函数往往会被优先使用。
 */
fun String.toString(): String {
    val stringBuffer = StringBuffer()
    return stringBuffer.toString()
}

/**
 * java 调用扩展成员相当于调用静态方法
 * BigDecimal bd = ExtendTestKt.getBd("11");
 */
val String.bd: BigDecimal
    get() = BigDecimal(this)
//    set(value) {}

