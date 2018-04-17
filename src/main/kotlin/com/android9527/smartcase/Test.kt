package com.android9527.smartcase

import com.android9527.entity.People

/**
 * Created by chenfeiyue on 18/2/12.
 * Description: 可空类型和智能类型转换
 */
fun main(args: Array<String>) {
    val people = People("zhangsan", 20)
    smartCase(people)
}

fun smartCase(any: Any) {
    any ?: return
    if (any is People) {
        // any instanceof People
        // People p = (People)any
        // p.getName()
        println(any.name)
    }
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` 在该条件分⽀内⾃动转换成 `String`
        return obj.length
    }
    // 在离开类型检测分⽀后，`obj` 仍然是 `Any` 类型
    return null
}