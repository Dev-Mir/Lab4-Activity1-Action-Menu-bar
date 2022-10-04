package com.example.lab4activityone

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class mainmenu_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menuactivity)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.logoutId){
            Toast.makeText(this, "Log out", Toast.LENGTH_SHORT).show()
            val intent : Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        if (item.itemId == R.id.homeId){
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
            val intent : Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }



        return true

    }



    }
