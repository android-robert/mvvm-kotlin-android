package com.robert.recyclerviewlivedata.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.robert.recyclerviewlivedata.R
import com.robert.recyclerviewlivedata.model.User
import java.util.*

class RecyclerViewAdapter(var context: Activity?, var userArrayList: ArrayList<User?>?) : RecyclerView.Adapter<ViewHolder?>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val rootView = LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        return RecyclerViewViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = userArrayList?.get(position)
        val viewHolder = holder as RecyclerViewViewHolder
        viewHolder.txtView_title?.text = user?.title
        viewHolder.txtView_description?.text = user?.description
    }

    override fun getItemCount(): Int {
        return userArrayList?.size!!
    }

    internal inner class RecyclerViewViewHolder(itemView: View) : ViewHolder(itemView) {
        var imgView_icon: ImageView? = itemView.findViewById<ImageView?>(R.id.imgView_icon)
        var txtView_title: TextView? = itemView.findViewById<TextView?>(R.id.txtView_title)
        var txtView_description: TextView? = itemView.findViewById<TextView?>(R.id.txtView_description)

    }

}