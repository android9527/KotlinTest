package com.android9527.smartcase

import com.android9527.entity.People

/**
 * Created by chenfeiyue on 18/2/12.
 * Description: 可空类型和智能类型转换
 */
fun main(args: Array<String>) {
    val s: String? = null    // 可空类型
//    println(s.length)      // 编译错误
    println(s?.length)
    val ss = s ?: return
    println("ss not null $ss")


    val people = People("zhangsan", 20)
    smartCase(people)
}

fun smartCase(any: Any) {
    if (any is People) {
        println(any.name)
    }
}