package com.example.deliverismadmin.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deliverismadmin.R
import com.example.deliverismadmin.databinding.ActivityFeedbackBinding

class Feedback : AppCompatActivity() {
    private var binding:ActivityFeedbackBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFeedbackBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.navigationAddBack?.setOnClickListener {
            onBackPressed()
        }
    }
}