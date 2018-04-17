package com.android9527.lambada

/**
 * Created by chenfeiyue on 18/2/7.
 * Description:
 */
open class View {
    fun setOnClickListener(listener: OnClickListener) {

    }

    interface OnClickListener {
        fun onClick(view: View)
    }
}

open class Button : View() {

}
