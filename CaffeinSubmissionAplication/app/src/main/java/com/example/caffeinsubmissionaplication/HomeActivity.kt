package com.example.caffeinsubmissionaplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    private lateinit var rv_menuCoffee: RecyclerView
    private var list: ArrayList<Coffee> = arrayListOf()
    private var title:String = "Caffein Application"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setActionBarTitle(title)

        rv_menuCoffee = findViewById(R.id.rv_menuCoffee)
        rv_menuCoffee.setHasFixedSize(true)

        list.addAll(CoffeeData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rv_menuCoffee.layoutManager = LinearLayoutManager(this)
        val ListCoffeeAdapter = listCoffeeAdapter(list)
        rv_menuCoffee.adapter = ListCoffeeAdapter
    }

//    ACTION MENU
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode:Int) {
        when(selectedMode) {
            R.id.action_about -> {
                val moveAbout = Intent(this@HomeActivity, aboutActivity::class.java)
                startActivity(moveAbout)
            }
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

}