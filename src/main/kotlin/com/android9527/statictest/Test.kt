package com.android9527.statictest


/**
 * Created by chenfeiyue on 18/2/12.
 * Description:
 */
fun main(args: Array<String>) {
    ObjectTest.test()
    CompanionTest.TAG
    val i = 9
    CompanionTest.getInstance().test()
}