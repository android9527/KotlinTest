package com.android9527.delegate.interfacedelegate

/**
 * Created by chenfeiyue on 18/2/7.
 * Description:
 */
fun main(args: Array<String>) {

    val carDriver = CarDriver()
    val guoQi = CEO(carDriver)
    guoQi.drive()
}

/**
 *  赋予开车的能力
 */
open class CarDriver : IDriver {
    override fun drive() {
        println("CarDriver 开车")
    }
}

//class CEO(val carDriver: CarDriver) : IDriver {
//    override fun drive() {
//        carDriver.drive()
//    }
//}

class CEO(val carDriver: CarDriver) : IDriver by carDriver