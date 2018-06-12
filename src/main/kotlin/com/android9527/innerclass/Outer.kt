package com.android9527.innerclass

import com.android9527.lambada.View

/**
 * Created by chenfeiyue on 2018/4/16.
 * Description: 内部类
 * kotlin 默认内部类为public static final
 * 注意调用方式及内存泄漏相关
 *
 * 对象表达式用来替代Java的匿名内部类
 */
class Outer {
    constructor() {
        println("constructor")
    }
    val helloWorld = "Hello World"

    inner class Inner {
        fun getOuter(): Outer {
            return this@Outer
        }
    }
    init {
        println("init")
    }
}

/**
 * 内部类
 * 1.kotlin 默认内部类为public static final，不能持有外部类的状态（属性、方法等）
 * 2.给内部类加上inner关键词之后，就会变成非静态内部类，可以访问外部类的属性和方法
 * 3.非静态内部类想访问外部类的属性，可以使用 this@外部类名.外部类属性名 的形式访问
 * 4.非静态内部类可以访问到外部静态内部类的方法和属性，静态内部类访问不到外部所有的属性和方法
 *
 * 注意调用方式及内存泄漏相关
 *
 * 对象表达式用来替代Java的匿名内部类
 */
fun main(args: Array<String>) {
    val outer = Outer()
    val innerClass = outer.Inner()
    val view = View()
    // kotlin匿名内部类，可以继承一个类，实现多个接口
    view.setOnClickListener(object : Any(), View.OnClickListener {
        override fun onClick(view: View) {
        }
    })
}