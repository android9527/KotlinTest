package com.android9527

import org.jetbrains.annotations.NotNull

/**
 * Created by chenfeiyue on 17/12/13.
 * Description: 基本语法
 * /** */
 */
fun main(args: Array<String>) {

    val i: Int = 3
    println(i.javaClass)
    println(i)

    var nickname: String //如果变量声明的时候没有初始化，就必须要指明类型


    val string: String? = null   // 可空类型

//    println(string.length)      // 编译错误
//    如果不为空则... 的简写 ?.
    println(string?.length)

    /**
     * !!表达式 当 string 为 null 时，抛出一个 NPE，否则返回 string 的长度值。
     */
//    println(string!!.length)


    // 尽管val引用自身是不可变的，但是它指向的对象可能是可变的
    val list = arrayListOf("Java")
    list.add("Kotlin")


    /**
     * 字符串模板
     */
    println("ss not null $string")
    println("result is ${string?.replace(" ", "")}")

    /**
     *  引用原⽣字符串 使⽤三个引号（ """ ） 分界符括起来， 内部没有转义并且可以包含换⾏和任何其他字符:
     */
    println("""

    """)

    val name: String = "abc"
    val `object`: String = "abc"

    val name1: String = String(charArrayOf('a', 'b', 'c'))

    println(name == name1)
    println(name === name1)

    // 这是⼀个单⾏注释
    /* 这是⼀个多⾏的
     块注释。 */

    /** /** */ */

    /**
     * 变长参数
     */
    test(1, 2, 3, string = "")
    println("i(3,5) is ${sum(3, 5)}")


    1 + 2 shl 2

    1 shl 2 + 3 and 1 shl (2 + 3)
}


/**
 * 智能类型转换
 */
fun smartCast(any: Any) {
    if (any is String) {
        /**
         * any instanceof String
         * String string = (String)any
         * string.getName()
         */
        println(any.length) // any is automatically cast to String
    }
}

fun add(x: Int, y: Int): Int {
    return x + y
}

/**
 * 函数表达式
 */
inline fun sum(x: Int, y: Int): Int = x + y

val sum = { x: Int, y: Int -> x + y }

/**
 * kotlin 变长参数
 */
fun test(vararg arg: Int, string: String): Int {
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



