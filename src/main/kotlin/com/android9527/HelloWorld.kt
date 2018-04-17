package com.android9527

import com.android9527.extension.bd
import org.jetbrains.annotations.NotNull

/**
 * Created by chenfeiyue on 17/12/13.
 * Description:
 * /** */
 */
fun main(args: Array<String>) {
    val a: Short = 0
    val s: String? = null    // 可空类型
//    println(s.length)      // 编译错误
    println(s?.length)
    val string = s ?: return
    println("ss not null \$ $string")
    println("result is ${string.replace(" ", "")}")

    // 尽管val引用自身是不可变的，但是它指向的对象可能是可变的
    val list = arrayListOf("Java")
    list.add("Kotlin")

    val name: String = "abc"
    val `object`: String = "abc"

    val name1: String = String(charArrayOf('a', 'b', 'c'))

    println(name == name1)
    println(name === name1)

    test(1, 2, 3)

    println("i(3,5) is ${i(3, 5)}")
    val aaa = "11".bd

    // 这是⼀个⾏注释
    /* 这是⼀个多⾏的
     块注释。 */
    /** /** */ */
    for (c in name) {
        println(c)
    }
}

/**
 * Kotlin 有两种类型的字符串字⾯值: 转义字符串, 以及原⽣字符串可以包含换⾏和任意⽂本。转义字符串很像 Java 字符串:
 */
val s = "Hello, world!\n"

/**
 *  引用原⽣字符串 使⽤三个引号（ """ ） 分界符括起来， 内部没有转义并且可以包含换⾏和任何其他字符:
 */
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

@NotNull
fun put(name: String) {

    print(name)
}

// kotlin 访问控制
// java private protected friendly public
// 在Kotlin编程中有四种修饰词：private,protected,internal,public，
// 默认的修饰词是public。这些修饰词可以用在类，对象，接口，构造函数，属性上



