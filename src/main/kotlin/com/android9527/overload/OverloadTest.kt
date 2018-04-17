package com.android9527.overload

/**
 * Created by chenfeiyue on 18/2/12.
 * Description: 函数重载、默认参数、具名参数
 */

fun check(name: String, mobile: String, id: String, age: Int): Boolean {
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
    val array = arrayOf("1", "2")
    checkVararg("1", "2", age = 18)

    // 具名参数
//    check(age = 18, mobile = "180xxxxxxxx")
}