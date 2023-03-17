package com.carma.toasterlibrary


import android.content.Context
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.delay
import java.lang.Thread.sleep

/*
class ToasterMessage {
    companion object {
        fun show(context: Context, message: String, duration: Int = Toast.LENGTH_SHORT) {
            Toast.makeText(context, message, duration).show()
        }
    }
}
*/
class StartAR {
    enum class STATUS {
        OK, ERROR
    }
    companion object {
        var status = STATUS.OK
        var ERROR_CODE = "UNKOWN_ERROR"

        fun start() : String {
            sleep(5000)
            Log.d("StartAR","Start")
            return if (status == STATUS.OK) {
                "OK"
            } else {
                "ERROR : $ERROR_CODE"
            }
        }
    }
}