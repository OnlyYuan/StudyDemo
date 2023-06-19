package com.example.studydemo

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.IBinder
import android.util.Log
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.registerForActivityResult
import androidx.activity.viewModels
import com.example.studydemo.service.MyService
import com.example.studydemo.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private var iMAidlInterface:IMAidlInterface?= null
    private val mViewModel:MainViewModel by viewModels()
    private val mLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){

    }
    private val mLauncher2 = registerForActivityResult(ActivityResultContracts.RequestPermission()){}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()

    }

    private fun initData() {
        // VpnService.prepare()
        mViewModel.currentName.value = "小明"
        mViewModel.currentName.observe(this){
            Log.i("11","====>currentName${it}")
        }
        mViewModel.getName()
        Log.i("11","====>getName${ mViewModel.getName()} he ${mViewModel.getData()}")
    }

    private fun bindService(){
        val  intent = Intent(this@MainActivity,MyService::class.java)
        bindService(intent,conn,Context.BIND_AUTO_CREATE)
    }


    private fun aidlSetData(){

        try {
            iMAidlInterface?.setAge("12岁")
            iMAidlInterface?.setName("小王")
        }catch (e:Exception){
            e.printStackTrace()
        }
    }


    private var conn = object :ServiceConnection{
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            //根据情况返回ibinder的值
            iMAidlInterface= IMAidlInterface.Stub.asInterface(service)

        }

        override fun onServiceDisconnected(name: ComponentName?) {
            //中断

        }

    }

}