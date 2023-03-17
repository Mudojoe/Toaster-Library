package com.carma.toasterlibrary

import android.content.Context
import android.os.Handler
import android.util.Log
import androidx.startup.Initializer
import com.google.ar.core.ArCoreApk




class CheckARCore (){


    fun maybeEnableArButton() :String {
        var returnMsg  :String
        val availability = ArCoreApk.getInstance().checkAvailability(ARManager.myContext)
        if (availability.isTransient) {
            // Continue to query availability at 5Hz while compatibility is checked in the background.
            Handler().postDelayed({
                maybeEnableArButton()
            }, 200)
        }
        if (availability.isSupported) {
            returnMsg = "OK"
            Log.d("maybeEnableArButton", "Supported")
        } else { // The device is unsupported or unknown.
            val errMsg = "Not Supported"
            returnMsg = "Error : $errMsg"
            Log.d("maybeEnableArButton", "NOT Supported")
        }
        return returnMsg
    }
}

// Initializes ARManager.
class CheckARManagerInitializer : Initializer<ARManager> {
    override fun create(context: Context): ARManager {
        ARManager.initialize(context)
        return ARManager.getInstance(context)
    }
    override fun dependencies(): List<Class<out Initializer<*>>> {
        // No dependencies on other libraries.
        return emptyList()
    }
}

class ARManager {

    companion object {
        var arManager : ARManager? = null

        lateinit var myContext : Context
        fun initialize(context : Context) {
            myContext = context
        }
        fun getInstance(context: Context): ARManager {
            return if (arManager == null){
                arManager = ARManager()
                arManager as ARManager
            } else {
                arManager as ARManager
            }

        }
    }
}