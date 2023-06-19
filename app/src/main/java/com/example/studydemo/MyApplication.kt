package com.example.studydemo

import android.app.Application
import com.example.studydemo.net.CommonRetrofit
import com.example.studydemo.net.RetrofitUtil
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp()
class MyApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        RetrofitUtil.getInstance().init()
    }
}