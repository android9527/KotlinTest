package com.android9527.lambada

/**
 * Created by chenfeiyue on 18/2/7.
 * Description:
 */
class View {
    interface OnClickListener {
        fun onClick(view: View)
    }

    fun setOnClickListener(listener: OnClickListener) {

    }
}