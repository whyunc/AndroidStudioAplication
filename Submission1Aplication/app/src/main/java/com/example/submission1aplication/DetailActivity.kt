package com.example.submission1aplication

import android.icu.text.CaseMap
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {

    private val title:String = "Detail User"

    companion object {
        const val EXTRA_USER = "extra_user"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setActionBarTitle(title)

        val detailPhoto: CircleImageView = findViewById(R.id.detail_img)
        val detailName: TextView = findViewById(R.id.detail_name)
        val detailUsername: TextView = findViewById(R.id.detail_username)
        val detailFollowers: TextView = findViewById(R.id.detail_followers)
        val detailFollowing: TextView = findViewById(R.id.detail_following)
        val detailRepo: TextView = findViewById(R.id.detail_repo)
        val detailCompany: TextView = findViewById(R.id.detail_company)
        val detailLocation: TextView = findViewById(R.id.detail_location)

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User

        detailPhoto.setImageResource(user.avatar)
        detailName.text = user.name
        detailUsername.text = user.username
        detailFollowers.text = user.followers
        detailFollowing.text = user.following
        detailCompany.text = user.company
        detailRepo.text = user.repository
        detailLocation.text = user.location

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setActionBarTitle(title: String){
        supportActionBar?.title = title
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}