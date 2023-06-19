package com.example.studydemo.model.api

import retrofit2.Call
import retrofit2.http.POST

interface ApiService {

    @POST
    fun getList():Call<String>
}