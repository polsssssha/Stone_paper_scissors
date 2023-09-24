package com.example.ssp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    companion object {

        const val TOTAL_COUNT = "total_count"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val resultTextView = findViewById<TextView>(R.id.result_text_view)

        val result = intent.getStringExtra("result")
        resultTextView.text = result
    }
}