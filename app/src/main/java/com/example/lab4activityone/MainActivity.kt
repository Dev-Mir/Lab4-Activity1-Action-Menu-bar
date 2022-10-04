package com.example.lab4activityone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun next(view: View){
       val intent : Intent = Intent(this,mainmenu_activity::class.java)
        startActivity(intent)
    }
}