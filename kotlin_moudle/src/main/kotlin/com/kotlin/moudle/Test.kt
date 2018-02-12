package com.kotlin.moudle

import kotlin.reflect.KProperty

/**
 * Created by chenfeiyue on 18/2/12.
 * Description: 属性代理
 */
class DelegateTest {

    var value : String? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println(property.name)
        return value ?: "default value"
    }

    operator fun setValue(any: Any?, property: KProperty<*>, value: String?) {
        this.value = value
    }
}