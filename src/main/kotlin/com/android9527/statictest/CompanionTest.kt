package com.android9527.statictest

/**
 * Created by chenfeiyue on 18/2/12.
 * Description:
 */
class CompanionTest {
    companion object {

        @Volatile private var singleton: CompanionTest? = null


        @JvmField var TAG = "CompanionTest"

        @JvmStatic
        fun getInstance(): CompanionTest {
            if (null == singleton) {
                synchronized(CompanionTest::class.java) {
                    if (null == singleton) {
                        singleton = CompanionTest()
                    }
                }
            }
            return singleton!!
        }
    }
}