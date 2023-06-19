package com.example.studydemo.aidl

import android.util.Log
import com.example.studydemo.IMAidlInterface

/**
 * aidl实现
 */
class IMAidlImpl: IMAidlInterface.Stub() {
    private var name :String?=""
    private var age :String?= ""

    override fun basicTypes(
        anInt: Int,
        aLong: Long,
        aBoolean: Boolean,
        aFloat: Float,
        aDouble: Double,
        aString: String?
    ) {

    }

    override fun setName(name: String?) {
        this.name = name
        Log.i("1","--->name${name}")
    }

    override fun setAge(age: String?) {
        this.age = age
        Log.i("1","--->name${age}")
    }

    override fun getName(): String {
       return  name?:""
    }

    override fun getAge(): String {
        return  age?:""
    }


}