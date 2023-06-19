package com.example.studydemo.net

class RetrofitUtil private constructor(){
    companion object{
        fun getInstance():RetrofitUtil {
            return SingleTonHolder.holder
        }
    }

    private object SingleTonHolder{
        val holder = RetrofitUtil()
    }

    val mCommonRetrofit = CommonRetrofit()

   fun init() {
       mCommonRetrofit.init()
   }

    inline fun <reified T> getService():T = mCommonRetrofit.getService()

}