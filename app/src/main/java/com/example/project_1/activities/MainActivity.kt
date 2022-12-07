package com.example.project_1.Activities

import PlayerFragment
import TeamFragment
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentContainer
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.project_1.R
import com.example.project_1.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        val navController = findNavController(R.id.nav_host_fragment)

        bottomNav.setupWithNavController(navController)




    }
}