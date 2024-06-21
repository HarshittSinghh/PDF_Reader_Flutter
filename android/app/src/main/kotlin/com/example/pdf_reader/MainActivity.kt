package com.example.pdf_reader

import io.flutter.embedding.android.FlutterActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import android.view.WindowInsetsController

class MainActivity: FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setWindowFocusChangeListener()
    }

    private fun setWindowFocusChangeListener() {
        window.decorView.setOnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                Log.d("FocusEvent", "View ${view.id} gained focus")
            } else {
                Log.d("FocusEvent", "View ${view.id} lost focus")
            }
        }
    }
}
