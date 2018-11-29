package com.example.muhaimenn.kotlinpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val foodList= arrayListOf("chinese","hamburger","pizza","mcDonalds","Barros pizza")
        foodButton.setOnClickListener {
            val random=Random();
            val randomFood=random.nextInt(foodList.count())
            myText.text=foodList[randomFood]
        }
    }
}
