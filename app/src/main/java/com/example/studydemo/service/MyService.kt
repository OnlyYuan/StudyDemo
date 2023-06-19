package com.example.studydemo.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.studydemo.aidl.IMAidlImpl

class MyService : Service() {

    override fun onBind(intent: Intent): IBinder {
        mIBinder.name = "12321321"
      return mIBinder
    }

    private val mIBinder = IMAidlImpl()

}