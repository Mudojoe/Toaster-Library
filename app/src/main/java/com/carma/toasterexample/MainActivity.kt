package com.carma.toasterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carma.toasterlibrary.CheckARCore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val checkARcore = CheckARCore()
        CheckARCore().maybeEnableArButton()

        }
}