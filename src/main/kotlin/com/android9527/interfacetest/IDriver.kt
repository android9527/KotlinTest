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