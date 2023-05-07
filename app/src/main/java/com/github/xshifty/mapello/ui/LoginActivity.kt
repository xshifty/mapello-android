package com.github.xshifty.mapello.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.github.xshifty.mapello.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    override fun onStart() {
        super.onStart()

        val loginAct = this
        val btnLogin = findViewById<Button>(R.id.doLogin)

        btnLogin.setOnClickListener {
            startActivity(Intent(loginAct, SearchActivity::class.java))
        }
    }

    override fun onBackPressed() {
        finish()
    }
}