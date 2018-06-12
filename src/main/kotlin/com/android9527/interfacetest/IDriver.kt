package com.android9527.interfacetest

/**
 * Created by chenfeiyue on 18/2/7.
 * Description:
 */
interface IDriver {
    fun drive()
    fun getName() {
        println("default fun getName()")
    }
    var age: Int

//    fun setAge(age : Int)
//    fun getAge(): Int
}

fun main(args: Array<String>) {
    val z : IDriver = CarDriver()
    z.drive()
}

class CarDriver : IDriver{
    override fun drive() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override var age: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}
}