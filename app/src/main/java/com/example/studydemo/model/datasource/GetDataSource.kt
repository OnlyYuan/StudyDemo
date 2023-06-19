package com.example.studydemo.model.datasource

import com.example.studydemo.model.api.ApiService
import com.example.studydemo.net.RetrofitUtil
import retrofit2.Call
import retrofit2.Response
import java.util.logging.Handler
import javax.security.auth.callback.Callback

class GetDataSource {
    private val mHandle = object : android.os.Handler() {

    }

    fun load():String{
        RetrofitUtil.getInstance().getService<ApiService>()
            .getList().enqueue(object :Callback, retrofit2.Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {

                }

                override fun onFailure(call: Call<String>, t: Throwable) {

                }
            })
        return "string"
    }

}