package com.carma.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {
    companion object {
        fun show(context: Context, message: String, duration: Int = Toast.LENGTH_SHORT) {
            Toast.makeText(context, message, duration).show()
        }
    }
}