package com.example.caffeinsubmissionaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class aboutActivity : AppCompatActivity() {

    private var title:String = "About ME"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setActionBarTitle(title)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}