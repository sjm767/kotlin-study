package com.jaeshim.lecture.part3

import com.jaeshim.objects.Person

fun main(){
    val person = Person("jaeshim",34)

    //필드를 통해 getter에 바로 접근
    println(person.name)
    println(person.age)

    //필드를 통해 setter에 바로 접근
    person.age=10
    println(person.name)
    println(person.age)


}