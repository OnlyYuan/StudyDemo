package com.example.studydemo.designpattern.xiangyuan

class TrainTicket(
    private var from:String,
    private var to:String,
    private var price:String
):ITicket {

    override fun showInfo(bunk: String) {
      println("from  $from  to $from price $price")
    }

    fun getA(){

    }
}