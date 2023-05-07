package com.github.xshifty.mapello.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.xshifty.mapello.R
import java.util.Timer
import java.util.TimerTask

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val mainAct = this

        Timer().schedule(object : TimerTask() {
            override fun run() {
                startActivity(Intent(mainAct, LoginActivity::class.java))
            }
        }, 2000)
    }
}