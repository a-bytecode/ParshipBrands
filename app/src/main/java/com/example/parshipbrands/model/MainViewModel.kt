package com.example.parshipbrands.model

import android.graphics.Color
import android.widget.TextView
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var needBoolean = false

    fun mainFunc(textView: TextView) {

        if (!needBoolean) {
            needBoolean = true
            textView.text = "Elitepartner"
            textView.setTextColor(Color.BLUE)

        } else {
            needBoolean = false
            textView.text = "Parship"
            textView.setTextColor(Color.RED)

        }

    }

}