package com.android9527

/**
 * Created by chenfeiyue on 18/2/7.
 * Description:
 */
// 常规用法
class People1(name: String) {
}
// 当主构造函数有注解或者可见性修饰符，需加 constructor 关键字
class People2 public constructor(name: String) {
}
//若主构造函数中，不进行初始化, 可放在init{}中
class People3(name: String) {
    val name: String
        get(){
            println("name------------>")
            return ""
        }

}
// 如果类有一个主构造函数（无论有无参数），每个次构造函数需要直接或间接委托给主构造函数，用this关键字
class People4 {
    constructor() {
        println("constructor")
    }
    constructor(name: String) : this() {
        println("name")
    }
    constructor(name: String, age: Int) : this(name) {
        println("ame: String, age: Int")
    }

    init {
        println("initialize")
    }
}

open class Foo {
    open val x: Int get() = 1
}
class Bar1 : Foo() {
    override val x: Int = 3
}

fun main(args: Array<String>) {
    People4()
}