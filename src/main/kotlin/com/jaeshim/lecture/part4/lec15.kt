package com.jaeshim.lecture.part4

fun main(){

    val array = arrayOf(100,200)

//    for(i in array.indices){
//        println("${i}, ${array[i]}")
//    }

    //index와 value를 한 번에 받는 방법
    for((idx,value) in array.withIndex()){
        println("${idx},${value}")
    }



}