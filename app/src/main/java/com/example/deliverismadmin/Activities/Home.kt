package com.example.deliverismadmin.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deliverismadmin.R
import com.example.deliverismadmin.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private var binding:ActivityHomeBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.addItemCard?.setOnClickListener {
            startActivity(Intent(this,AddItem::class.java))
        }
        binding?.allItemCard?.setOnClickListener {
            startActivity(Intent(this,All_Item::class.java))
        }
        binding?.cardFeedback?.setOnClickListener {
            startActivity(Intent(this,Feedback::class.java))
        }
    }


}