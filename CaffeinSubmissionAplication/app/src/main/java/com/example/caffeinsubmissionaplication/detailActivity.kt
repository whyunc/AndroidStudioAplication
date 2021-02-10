package com.example.caffeinsubmissionaplication

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.w3c.dom.Text

class detailActivity : AppCompatActivity() {
    private var title:String = "Detail Coffee"

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_PRICE =  "extra_price"
        const val EXTRA_TYPE = "extra_type"

        const val EXTRA_COFFEE = "extra_coffee"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvDetailName: TextView = findViewById(R.id.tv_detailName)
        val tvDetailPrice: TextView = findViewById(R.id.tv_detailPrice)
        val tvDetailType: TextView = findViewById(R.id.tv_detailType)
        val tvDetailDetail:TextView = findViewById(R.id.tv_detailDetail)
        val tvDetailImg: ImageView = findViewById(R.id.tv_detailImg)

        //val name = intent.getStringExtra(EXTRA_NAME)
        //val detail = intent.getStringExtra(EXTRA_DETAIL)
        //val price = intent.getStringExtra(EXTRA_PRICE)
        //val type = intent.getStringExtra(EXTRA_TYPE)
        //val img = intent.getIntExtra(EXTRA_IMG, 0)
        val coffee = intent.getParcelableExtra<Coffee>(EXTRA_COFFEE) as Coffee

        tvDetailName.text = coffee.name
        tvDetailPrice.text = coffee.price
        tvDetailType.text = coffee.type
        tvDetailDetail.text = coffee.detail
        Glide.with(this)
            .load(coffee.photo)
            .apply(RequestOptions())
            .into(tvDetailImg)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}