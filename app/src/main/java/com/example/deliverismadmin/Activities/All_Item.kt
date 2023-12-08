package com.example.deliverismadmin.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deliverismadmin.R
import com.example.deliverismadmin.databinding.ActivityAllItemBinding

class All_Item : AppCompatActivity() {
    private var binding:ActivityAllItemBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAllItemBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.navigationAddBack?.setOnClickListener {
            onBackPressed()
        }
    }
}