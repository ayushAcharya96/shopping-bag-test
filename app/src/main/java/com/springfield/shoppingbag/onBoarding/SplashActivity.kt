package com.springfield.shoppingbag.onBoarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.springfield.shoppingbag.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        
        startActivity(Intent(this, OnBoardingActivity::class.java))
        finish()
    }
}