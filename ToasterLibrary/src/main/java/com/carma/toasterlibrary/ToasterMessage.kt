package com.carma.toasterlibrary


import android.content.Context
import android.util.Log
import android.widget.Toast


class ToasterMessage {
    companion object {
        fun show(context: Context, message: String, duration: Int = Toast.LENGTH_SHORT) {
            Toast.makeText(context, message, duration).show()
        }
    }
}

class StartAR {
    companion object {
        fun start() : String {

            Log.d("StartAR","Start")
            return "OK"
        }
    }
}