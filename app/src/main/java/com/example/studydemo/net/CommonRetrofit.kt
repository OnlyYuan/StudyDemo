package com.example.studydemo.net

import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit

class CommonRetrofit {
    var mRetrofit: Retrofit? = null

    private val okHttpClient = OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(10,TimeUnit.SECONDS)
        .writeTimeout(10,TimeUnit.SECONDS)
        .build()


    fun init(){
        mRetrofit = Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("url")
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
    }

    /**
     *
     */
    inline fun <reified T> getService():T{
        val retrofit = mRetrofit?:throw UnsupportedOperationException("you must call init() method first")

        return retrofit.create(T::class.java)
    }

}