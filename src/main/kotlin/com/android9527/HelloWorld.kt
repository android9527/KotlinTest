package com.android9527

/**
 * Created by chenfeiyue on 17/12/13.
 * Description:
 */
fun main(args: Array<String>) {
    val a : Int = 0
    var b : Int = 128
    var c : Int? = null
    println("$a + $b + $c")


    val name = "abc"
    println(name.length)
    val `object`: String = "abc"

    val charArray = charArrayOf('a', 'b', 'c')
    val name1: String = String(charArray)

    println(name == `object`)
    println(name === name1)

    test(1, 2, 3)

    println("i(3,5) is ${i(3, 5)}")
}


fun add(x: Int, y: Int): Int {
    return x + y
}

/**
 * 函数表达式
 */
fun sum(x: Int, y: Int): Int = x + y

val i = { x: Int, y: Int -> x + y }

/**
 * kotlin 变长参数
 */
fun test(vararg arg: Int): Int {
    var sum = 0
    arg.forEach { n ->
        sum += n
    }
    return sum
}


