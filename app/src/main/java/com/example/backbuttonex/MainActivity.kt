package com.example.backbuttonex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var isDoublePressed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        Log.d("MainActivity", "backbutton")
        if (isDoublePressed == true){
            finish()
        }

        isDoublePressed = true
        Toast.makeText(this, "종료하실려면 뒤로가기 한 번 더 클릭", Toast.LENGTH_SHORT).show()

        Handler().postDelayed(Runnable {
            isDoublePressed = false
        }, 2000)
    }
}