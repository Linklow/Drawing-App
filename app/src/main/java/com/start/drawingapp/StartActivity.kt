package com.start.drawingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start.btn_start

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)


        btn_start.setOnClickListener{
            val intent = Intent(this@StartActivity,DrawingActivity::class.java)
            startActivity(intent)
        }
    }

}