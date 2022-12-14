package com.adrianusid.sayapraja.data

import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.adrianusid.sayapraja.model.UserModel

class UserPreferences (context: Context){

    private var sharedPreferences : SharedPreferences ?= null

    private var editor : SharedPreferences.Editor ? = null

    private var id = MutableLiveData<String>()

    private var login = MutableLiveData<Boolean>()

    init {
        sharedPreferences = context.getSharedPreferences("pref", 0)
        editor = sharedPreferences?.edit()
        editor?.apply()
    }

    fun setId(uid : String){
        editor?.putString("userId",uid)
        editor?.apply()
    }
    fun getId() : LiveData<String> {
        id.value = sharedPreferences?.getString("userId","")
        return id

    }


    fun getLogin(): LiveData<Boolean>{
        login.value = sharedPreferences?.getBoolean("login", false)
        return login
    }
}