package com.carma.toasterlibrary


import android.util.Log
import kotlinx.coroutines.delay


enum class ReturnStatus {
    OK, ERROR
}

class StartAR {
    companion object {
        private var errorCode = "UNKNOWN ERROR"
        suspend fun start() : String {
            delay(5000)
            var status = ReturnStatus.OK
            Log.d("StartAR","Start")
            return if (status == ReturnStatus.OK)
                "OK"
            else
                "ERROR : $errorCode"
        }
    }
}