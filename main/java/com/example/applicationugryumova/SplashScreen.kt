package com.example.applicationugryumova


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val timer = object : CountDownTimer(3000,1000) {
            override fun onTick(millishUntilField: Long) {

            }

            override fun onFinish() {
                val intent = Intent(this@SplashScreen, OnBoarding::class.java)
                startActivity(intent)
                finish()
            }
        }
        timer.start()
    }
}