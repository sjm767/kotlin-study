package com.jaeshim.lecture.part3

import com.jaeshim.lecture.part3.objects.Log
import com.jaeshim.lecture.part3.objects.Movable

fun main(){

//    val newBaby = Person.newBaby("jaeshim")

//    println( Singleton.a)
//    Singleton.a+=10
//    println( Singleton.a)

    moveSomething(object: Movable{
        override fun move() {
           println("move")
        }

        override fun fly() {
          println("fly")
        }

    })
}

class Person private constructor(
    var name: String,
    var age: Int,
){

    companion object Factory : Log{
        const val MIN_AGE=1
        @JvmStatic
        fun newBaby(name: String): Person{
            log()
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory에요")
        }
    }
}

object Singleton{
    var a: Int = 0
}

private fun moveSomething(movable: Movable){
    movable.move();
    movable.fly();
}