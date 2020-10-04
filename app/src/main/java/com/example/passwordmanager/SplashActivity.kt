package com.example.passwordmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    private val Splash_Timeout:Long=3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
     //   actionBar?.hide()

       Handler().postDelayed({


            startActivity(Intent(this,
                AuthenticationActivity::class.java))


            finish()
        }, Splash_Timeout)

    }
}

