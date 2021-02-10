package com.example.mylistviewaplication

import android.content.Intent
import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import java.time.Year

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: HeroAdapter
    private lateinit var dataName: Array<String>
    private lateinit var dataDesc: Array<String>
    private lateinit var dataPhoto: TypedArray
    private lateinit var dataYear: Array<String>

    private var heroes = arrayListOf<Hero>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView : ListView = findViewById(R.id.tv_listview)
        adapter = HeroAdapter(this)
        listView.adapter = adapter

        prepare()
        addItem()

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val MoveDetail = Intent(this@MainActivity, DetailActivity::class.java)
            MoveDetail.putExtra(DetailActivity.EXTRA_HERO, heroes[position])
            startActivity(MoveDetail)
            Toast.makeText(this@MainActivity, heroes[position].name, Toast.LENGTH_SHORT).show()
        }
    }

    private fun prepare() {
        dataName = resources.getStringArray(R.array.data_name)
        dataDesc = resources.getStringArray(R.array.data_description)
        dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        dataYear = resources.getStringArray(R.array.year)
    }

    private fun addItem() {
        for (position in dataName.indices) {
            val hero = Hero(
                    dataPhoto.getResourceId(position, -1),
                    dataName[position],
                    dataDesc[position]
            )
            heroes.add(hero)
        }
        adapter.heroes = heroes
    }
}