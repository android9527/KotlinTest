package com.android9527.extension

import java.math.BigDecimal

/**
 * Created by chenfeiyue on 17/12/13.
 * Description: 函数扩展、属性扩展、运算符重载
 *
 *  扩展实际上并没有修改它所扩展的类。定义一个扩展，你并没有在类中插入一个新的成员，只是让这个类的实例对象能够通过.调用新的函数。

 *  注意，由于扩展并不会真正给类添加了成员属性，因此也没有办法让扩展属性拥有一个备份字段.这也是为什么初始化函数不允许有扩展属性。扩展属性只能够通过明确提供 getter 和 setter方法来进行定义.

 *  如果有同名同参数的成员函数和扩展函数，调用的时候必然会使用成员函数
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

    // 属性扩展
    val s1 = "11".bd
    val s2 = BigDecimal("22")

    println(s1.add(s2))
    println(s1 + s2)
    println(s1 * s2)

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

/**
 * 运算符重载
 */
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


val String.bd: BigDecimal
    get() = BigDecimal(this)

/**
 * java 调用扩展成员相当于调用静态方法
 * BigDecimal bd = ExtendTestKt.getBd("11");
 */
//val String.bd: BigDecimal
//    get() = BigDecimal(this)
////    set(value) {}
//
