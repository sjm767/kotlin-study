package com.jaeshim.lecture

import com.jaeshim.objects.JavaMoney
import com.jaeshim.objects.Money

fun main(){

//    val money1 = JavaMoney(2000)
//    val money2 = JavaMoney(1000)
//
//    if(money1 >money2){
//        println("Money1이 Money2보다 큽니다.")
//    }

//    val money1 = JavaMoney(1000L)
//    val money2 = money1;
//    val money3 = JavaMoney(1000L)
//
//    println(money1 === money2) //true
//    println(money1 === money3) //false
//    println(money1 == money3) //true

//    if(fun1() || fun2()){
//        println("")
//    }

    val money1= Money(1_000L)
    val money2= Money(2_000L)

    println(money1+money2)
}


fun fun1() : Boolean{
    println("fun 1")
    return true
}

fun fun2() : Boolean{
    println("fun 2")
    return false
}