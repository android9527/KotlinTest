package com.android9527.delegate.interfacedelegate

/**
 * Created by chenfeiyue on 18/2/7.
 * Description:
 */
fun main(args: Array<String>) {

    val carDriver = CarDriver()
    val xiaoMing = Boss(carDriver)
    xiaoMing.drive()
}

/**
 *  赋予开车的能力
 */
class CarDriver : IDriver {
    override fun drive() {
        println("CarDriver 开车")
    }
}

//class Boss(val carDriver: CarDriver) : IDriver {
//    override fun drive() {
//        carDriver.drive()
//    }
//}

class Boss(val carDriver: CarDriver) : IDriver by carDriver