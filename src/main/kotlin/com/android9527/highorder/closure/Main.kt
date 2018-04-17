package com.android9527.highorder.closure

import java.util.*

/**
 * Created by chenfeiyue on 2018/4/8.
 * Description:
 */
val string = "HelloWorld"

fun makeFun(): () -> Unit {
    var count = 0
    return fun() {
        println(++count)
    }
}



fun fibonacci(action: (Any) -> Unit): () -> Int {
    var first = 0
    var second = 1
    return fun(): Int {
        val result = first + second
        second += first
        first = result - first
        action(result)
        return result
    }
}



fun main(args: Array<String>) {
    val list = ArrayList<String>()
    list.add("1")
    list.add("2")
    list.add("3")
    list.forEach(::printHelloWorld)

    val f = fibonacci(::println)

    for(i in 0..6){
        f()
    }
}

fun printHelloWorld(msg: String) {
    println(msg)
}
