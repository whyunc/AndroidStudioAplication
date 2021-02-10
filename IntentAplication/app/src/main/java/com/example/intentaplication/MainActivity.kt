package com.example.intentaplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moveActivity: Button = findViewById(R.id.moveActivity)
        val moveData: Button = findViewById(R.id.moveData)
        val moveDial: Button = findViewById(R.id.moveDial)

        moveActivity.setOnClickListener(this)
        moveData.setOnClickListener(this)
        moveDial.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.moveActivity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.moveData -> {
                val moveData = Intent(this@MainActivity, moveDataActivity::class.java)
                moveData.putExtra(moveDataActivity.EXTRA_NAME, "Wahyu Nur Cahyo")
                moveData.putExtra(moveDataActivity.EXTRA_AGE, 22)
                startActivity(moveData)
            }
            R.id.moveDial -> {
                val dialNumber = "082248195310"
                val IntentDialNumber = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$dialNumber"))
                startActivity(IntentDialNumber)
            }
        }
    }
}