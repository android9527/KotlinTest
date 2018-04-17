package com.android9527.lambada

/**
 * Created by chenfeiyue on 18/2/7.
 * Description:
 */
fun main(args: Array<String>) {

    val view = View()
    view.setOnClickListener(object : View.OnClickListener {
        override fun onClick(view: View) {

        }
    })

    Thread {
        println(Thread.currentThread().name)
    }.start()

    Thread(Runnable { println(Thread.currentThread().name) }).start()
}