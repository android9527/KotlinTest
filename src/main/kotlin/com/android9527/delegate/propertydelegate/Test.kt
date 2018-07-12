package com.android9527.delegate.propertydelegate

import kotlin.reflect.KProperty

/**
 * Created by chenfeiyue on 18/2/12.
 * Description: 属性代理
 * 语法结构是： val/var <property name>: <Type> by <expression> 在 by 后面的属性就是代理，
 * 这样这个属性的 get() 和 set() 方法就代理给了它。
 */
class Test {

    /**
     * Kotlin lateinit 和 by lazy 的区别
     *
     * 1.lazy{} 只能用在val类型, lateinit 只能用在var类型
     * 2.lateinit不能用在可空的属性上和java的基本类型上
     * 3.lateinit可以在任何位置初始化并且可以初始化多次。
     * 而lazy在第一次被调用时就被初始化，想要被改变只能重新定义
     */
    lateinit var value: String


    init {
        value = ""
    }

    val hello by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        println("hello by lazy")
        "Hello World"
    }

    val x: String by Delegate()
    var y by Delegate()
}

fun main(args: Array<String>) {
    val test = Test()
    println(test.x)
    test.y = "y"
    println(test.y)
}


/**
 * 具体实现
 */
class Delegate {
    var value: String? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
//        println(property.name)

        // 读取缓存、数据库等
        return value ?: "default value"
    }

    operator fun setValue(any: Any?, property: KProperty<*>, value: String?) {
        this.value = value
        // 写入缓存等
    }

}