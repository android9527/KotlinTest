package com.android9527.interfacetest

/**
 * Created by chenfeiyue on 18/2/7.
 * Description:
 */
fun main(args: Array<String>) {
    val z : IDriver = ZhangSan()
    z.drive()
}


class ZhangSan : IDriver{
    override fun drive() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getName() {
    }
    override var age: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}
}