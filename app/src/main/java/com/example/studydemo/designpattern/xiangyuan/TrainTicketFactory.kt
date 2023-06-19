package com.example.studydemo.designpattern.xiangyuan

import java.util.concurrent.ConcurrentHashMap


class TrainTicketFactory {

    companion object{

        private val pool = ConcurrentHashMap<String,ITicket>()

        fun queryTicket(form:String,to:String,price:String):ITicket{

            val key = "$form to $to"
            if (TrainTicketFactory.pool.contains(key)){
                return TrainTicketFactory.pool[key]!!
            }

            val ticket = TrainTicket(form,to,price)
            TrainTicketFactory.pool[key] = ticket
            ticket.getA()

            return ticket
        }
    }

}