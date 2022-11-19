package com.jaeshim.lecture.part3

fun main(){

//    Cat()
}

private val NUM=3;
fun add(a:Int,b:Int):Int{
    println(NUM) //같은 파일 내 이므로 접근가능
    return a+b
}

class Cat internal constructor(name: String="고양이"){
    init {
        println(name)
    }
}

class Car(
    internal val name: String, //getter, setter가 internal
    private var owner: String, //getter, setter가 private
    _price: Int
){
    var price = _price //setter에만 private선언, 코틀린은 기본적으로 public이므로 getter는 public 그대로이다.
        private set
}
