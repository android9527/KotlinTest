package com.android9527.highorder

/**
 * Created by chenfeiyue on 18/3/19.
 * Description:
 */

fun main(args: Array<String>) {
    (0..5).map(::factorial).map(::println)
}

fun factorial(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1
    }
    return (2..n).reduce { acc, i -> acc * i }
}



























