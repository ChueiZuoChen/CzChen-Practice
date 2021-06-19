package com.example.czchen_practice.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.czchen_practice.databinding.ActivityMainBinding
import com.example.czchen_practice.main.Adapter.MainAdapter
import com.example.czchen_practice.main.notification.NotificationActivity

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val generateList = generateList()

        mainBinding.mainRecycler.layoutManager = LinearLayoutManager(this)
        mainBinding.mainRecycler.setHasFixedSize(true)
        mainBinding.mainRecycler.adapter = MainAdapter(generateList){
            itemClicked(it)
        }
    }

    private fun itemClicked(it: String) {
        when(it){
            "Notification" -> {val intent = Intent(this,NotificationActivity::class.java)
            startActivity(intent)}
            "Tester" -> {
                println(123)}

        }
    }

    private fun generateList(): List<String> {
        return listOf("Notification")
    }

}