package com.robert.recyclerviewlivedata.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.robert.recyclerviewlivedata.model.User
import java.util.*

class MainViewModel : ViewModel() {
    var userLiveData: MutableLiveData<ArrayList<User?>?>? = MutableLiveData()
    var userArrayList: ArrayList<User?>? = null
    fun getUserMutableLiveData(): MutableLiveData<ArrayList<User?>?>? {
        return userLiveData
    }

    private fun init() {
        populateList()
        userLiveData?.setValue(userArrayList)
    }

    private fun populateList() {
        val user = User()
        user.title = "MVVM Demo"
        user.description = "The MVVM model for Android demo"
        userArrayList = ArrayList()
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
        userArrayList?.add(user)
    }

    init {
        // call your Rest API in init method
        init()
    }
}