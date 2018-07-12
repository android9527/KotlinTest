package com.android9527.extension

/**
 * Created by chenfeiyue on 18/2/12.
 * Description: 函数重载、默认参数、具名参数
 */

fun check(name: String = "", mobile: String = "", id: String = "", age: Int): Boolean {
    println("$name + $mobile + $id + $age")
    return false
}

fun checkVararg(vararg args: String, age: Int): Boolean {
    return false
}

/**
 * kotlin 具名参数可自定义参数顺序
 */
fun main(args: Array<String>) {
    check("", "", "", 18)
    check(id = "", age = 18)
    check(id = "", age = 18, name = "", mobile = "")
    check(age = 1)


    val array = arrayOf("1", "2")

    // *array叫做Spread Operator，作用是把Array展开然后作为可变参数的实参，Spread Operator不能重载。
    checkVararg(*array, age = 18)

    // 具名参数
//    check(age = 18, mobile = "180xxxxxxxx")
}