package com.example.parshipbrands.model

import android.graphics.Color
import android.widget.TextView
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var myBoolean = false

    fun mainFunc(textView: TextView) {

        if (!myBoolean) {

            myBoolean = true
            textView.text = "Elitepartner"
            textView.setTextColor(Color.BLUE)

        } else {
            myBoolean = false
            textView.text = "Parship"
            textView.setTextColor(Color.RED)
        }
    }

}