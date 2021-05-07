package com.example.casting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for( i in 1..5) {

            val a = i*2
            Log.d("숫자", a.toString() )
        }

        for ( i in 2..10 step 2) {
            Log.d("숫자", i.toString())
        }
    }

    val num1 = "2000"

    val koreanAge = 2021 - num1.toInt() + 1



}

