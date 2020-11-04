package com.robert.recyclerviewlivedata.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.robert.recyclerviewlivedata.R
import com.robert.recyclerviewlivedata.adapter.RecyclerViewAdapter
import com.robert.recyclerviewlivedata.model.User
import com.robert.recyclerviewlivedata.viewmodel.MainViewModel
import java.util.*

class MainActivity : AppCompatActivity(), LifecycleOwner {
    var recyclerView: RecyclerView? = null
    var recyclerViewAdapter: RecyclerViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<RecyclerView?>(R.id.rv_main)
        val viewModel: MainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        userListUpdateObserver?.let { viewModel.getUserMutableLiveData()?.observe(this, it) }
    }

    var userListUpdateObserver: Observer<ArrayList<User?>?>? = Observer { userArrayList ->
        recyclerViewAdapter = RecyclerViewAdapter(this@MainActivity, userArrayList)
        recyclerView?.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView?.adapter = recyclerViewAdapter
    }
}