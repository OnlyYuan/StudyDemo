package com.example.studydemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.studydemo.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()
    }

    private fun initView() {
        println("第一个develop分支内容")
    }

}