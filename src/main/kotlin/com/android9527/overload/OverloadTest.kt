package com.android9527.overload

/**
 * Created by chenfeiyue on 18/2/12.
 * Description: 函数重载、默认参数、具名参数
 */

//fun test(s: String) {
//    test(0, false, s)
//}
//
//fun test(b: Boolean) {
//    test(0, b, "")
//}
//
//fun test(a: Int, b: Boolean, s: String) {
//    println()
//}

fun test(arg1: Int = 0, arg2: Boolean = false, arg3: String = "") {
    println("$arg1 + $arg2 + $arg3")
}


/**
 * kotlin 可自定义参数顺序
 */
fun main(args: Array<String>) {
    test()
    test(1)

    // 具名参数
    test(arg2 = false, arg3 = "arg3", arg1 = 1)
}
