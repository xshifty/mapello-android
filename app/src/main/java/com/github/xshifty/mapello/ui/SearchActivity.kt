package com.github.xshifty.mapello.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.github.xshifty.mapello.R

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
    }

    override fun onStart() {
        super.onStart()

        val searchFrom = findViewById<EditText>(R.id.searchFrom)
        val searchTo = findViewById<EditText>(R.id.searchTo)
    }

    override fun onBackPressed() {
        finish()
    }
}