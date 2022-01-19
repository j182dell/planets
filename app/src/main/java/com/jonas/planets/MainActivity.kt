package com.jonas.planets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.jonas.planets.databinding.ActivityMainBinding


val planetsArray = arrayOf(
            "Mercury",
            "Venus" ,
            "Earth" ,
            "Mars" ,
            "Saturn",
            "Jupiter" ,
            "Uranus" ,
            "Neptune"
            )


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        tabLayout.tabGravity = TabLayout.GRAVITY_CENTER
        tabLayout.tabMode = TabLayout.MODE_AUTO

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = planetsArray[position]
        }.attach()
    }
}


