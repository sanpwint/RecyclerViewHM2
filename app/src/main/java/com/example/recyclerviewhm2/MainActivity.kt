package com.example.recyclerviewhm2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var thingsArray = ArrayList<Things>()

        thingsArray.add(Things("Fine Grain Sugar","Price - $20.00",R.drawable.sugar))
        thingsArray.add(Things("Peanuts","Price - $20.00",R.drawable.peanuts))
        thingsArray.add(Things("Dawat Rice","Price - $80.00",R.drawable.rice))

        var thingsAdapter = ThingsAdapter(thingsArray)

        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = thingsAdapter
        recyclerview.setHasFixedSize(true)
    }
}
