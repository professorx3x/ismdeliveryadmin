package com.example.deliverismadmin.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deliverismadmin.R
import com.example.deliverismadmin.databinding.ActivityAddItemBinding

class AddItem : AppCompatActivity() {
    private var binding:ActivityAddItemBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddItemBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.navigationAddBack?.setOnClickListener {
            onBackPressed()
        }
    }
}