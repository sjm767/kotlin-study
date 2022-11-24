package com.jaeshim.lecture.part4

fun main(){

    val array = arrayOf(100,200)

//    for(i in array.indices){
//        println("${i}, ${array[i]}")
//    }

//    //index와 value를 한 번에 받는 방법
//    for((idx,value) in array.withIndex()){
//        println("${idx},${value}")
//    }
//
//    val numbers = listOf(100,200)
//    //비어있는 리스트. 들어올 타입이 무엇인지 명시해줘야 한다.
//    printNumbers(emptyList())

//
//    val numbers = listOf(100,200)
//
//    //가능은 하다
//    numbers.get(0)
//
//    //배열처럼 가져오기
//    println(numbers[0])
//
//    //for-each문 사용
//    for(number in numbers){
//        println(number)
//    }
//    for((idx,value) in numbers.withIndex()){
//        println("${idx} ${value}")
//    }

//    val numbers = mutableListOf(100,200)
//    numbers.add(300)

//    val numbers = setOf(100,200);
//
//    for(number in numbers){
//        println(number)
//    }
//
//    for((idx,value) in numbers.withIndex()){
//        println("${idx} ${value}")
//    }

    val oldMap = mutableMapOf<Int,String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    for(key in oldMap.keys){
        println(oldMap[key])
    }

    for((key,value) in oldMap.entries){
        println(key)
        println(value)
    }
}

private fun printNumbers(numbers: List<Int>){

}