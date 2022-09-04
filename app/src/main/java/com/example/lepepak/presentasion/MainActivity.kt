package com.example.lepepak.presentasion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.lepepak.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottommenu : BottomNavigationView = bmenu
        val navController = findNavController(R.id.hostlayout)
        bottommenu.setupWithNavController(navController)

        window.statusBarColor = ContextCompat.getColor(this, R.color.detailtop)

    }


}