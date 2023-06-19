package com.example.studydemo.model.repository

import javax.inject.Inject

class GetDataRepositoryImpl @Inject constructor():GetDataRepository{

     override fun getNum(): String {
         return "xiao xiao"
     }

 }