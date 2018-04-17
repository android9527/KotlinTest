package com.android9527.statictest

/**
 * Created by chenfeiyue on 18/2/12.
 * Description:伴生对象
 * Kotlin中的类不能拥有静态成员，没有static关键字
 * 与 Java 或 C# 不同， 在 Kotlin 中类没有静态⽅法。 在⼤多数情况下， 它建议简单地使⽤包级函数。
 * 如果你需要写⼀个可以⽆需⽤⼀个类的实例来调⽤、 但需要访问类内部的函数 （例如， ⼯⼚⽅法） ， 你可以把它写成该类内对象声明中的⼀员。
 * 更具体地讲， 如果在你的类内声明了⼀个伴⽣对象，你就可以使⽤像在 Java/C# 中调⽤静态⽅法相同的语法来调⽤其成员， 只使⽤类名作为限定符。
 */
class CompanionTest {

    private constructor()

    companion object {

        @Volatile private var singleton: CompanionTest? = null

        @JvmField val TAG = "CompanionTest"
        @JvmStatic fun getInstance(): CompanionTest {
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

    fun test() {
    }
}