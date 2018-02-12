package com.android9527.controlflow

/**
 * Created by chenfeiyue on 17/7/28.
 * Description:
 */
class ControlFlowTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            testWhen()
            testFor()
        }
    }
}

/**
 * if 表达式
 */
fun testIf() {
    val a: Int = 1
    val b: Int = 1
    var max = if (a > b) a else b


    max =
            if (a > b) {
                println()
                a
            } else {
                println()
                b
            }
}

fun testWhen() {
    // 1、简单用法
    val x: Int = 1
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

    // 2、如果很多分支需要相同的方式处理，则可以把多个分支条件放在一起，用逗号分隔：
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    // 3、可以用任意表达式（而不只是常量）作为分支条件
    when (x) {
        parseInt("10") -> println("s encodes x")
        else -> println("s does not encode x")
    }

    // 4、可以检测一个值在（in）或者不在（!in）某个区间或者集合
    val y: Any = "a"
    when (y) {
        in 1..10 -> println("x is in the range")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }

    // 5、检测一个值是（is）或者不是（!is）某个特定类型的值，由于智能转换，你可以访问该类型的方法和属性而需任何额外的检测。
    val result = when (y) {
        is String -> {
            println()
            y.startsWith("prefix")
        }
        is Int -> {
            y + 1
        }
        else -> {
            false
        }
    }
    println(result)
}

fun testFor() {
    // 1、遍历某个区间
    for (i in 0..4)//为闭区间[0,4]
        println(i)

    // 2、通过索引遍历一个数组或者一个 list，你可以这么做：
    val array = arrayOf(1, 2, 3)
    for (i in array.indices)
        println(array[i])

    // 3、Arrays库函数 withIndex ：
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }
}

fun parseInt(s: String): Int {
    return Integer.parseInt(s)
}

