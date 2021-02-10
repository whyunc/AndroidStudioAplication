package com.example.mylistviewaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_HERO = "extra_hero"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val detailIMGhero: ImageView = findViewById(R.id.detail_photo_hero)
        val detailNAMAhero: TextView = findViewById(R.id.detail_nama_hero)
        val detailYEARhero: TextView = findViewById(R.id.detail_year_hero)
        val detailDESChero: TextView = findViewById(R.id.detail_desc_hero)

        val hero = intent.getParcelableExtra<Hero>(EXTRA_HERO) as Hero

        detailIMGhero.setImageResource(hero.photo)
        detailNAMAhero.text = hero.name
        detailYEARhero.text = hero.year
        detailDESChero.text = hero.desc

    }
}