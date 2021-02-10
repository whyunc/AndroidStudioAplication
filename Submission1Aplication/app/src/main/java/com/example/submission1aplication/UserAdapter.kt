package com.example.submission1aplication

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.submission1aplication.databinding.ActivityMainBinding
import com.example.submission1aplication.databinding.ItemRowUserBinding
import de.hdodenhof.circleimageview.CircleImageView

class UserAdapter internal constructor(private val context: Context): BaseAdapter() {

    internal var users = arrayListOf<User>()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_row_user, parent, false)
        }

        val viewHolder = ViewHolder(itemView as View)
        val user = getItem(position) as User
        viewHolder.bind(user)
        return itemView
    }

    private inner class ViewHolder internal constructor(view: View) {
        private val imgItemPhoto: CircleImageView = view.findViewById(R.id.img_item_photo)
        private val itemName: TextView = view.findViewById(R.id.item_name)
        private val itemUsername: TextView = view.findViewById(R.id.iten_username)

        internal fun bind(user: User){
            imgItemPhoto.setImageResource(user.avatar)
            itemName.text = user.name
            itemUsername.text = user.username
        }
    }

    override fun getItem(position: Int): Any = users[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = users.size

}