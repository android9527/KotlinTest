package com.android9527.entity

/**
 * Created by chenfeiyue on 18/2/12.
 * Description:
 */

fun test1(){
    val people = People("zhangsan", 19)
    val p1 = people.copy(name = "zhangsan", age = 19)
    p1.age = 1
    if (people != p1) {

    }
}

fun main(args: Array<String>) {

}