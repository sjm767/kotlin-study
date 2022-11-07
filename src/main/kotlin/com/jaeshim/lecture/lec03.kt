package com.jaeshim

import com.jaeshim.objects.Person

fun main(){

//    val number1=3 //int
//    val number2: Long=number1.toLong()

//    val number1: Int?=3 //null이 들어갈 수 있는 int
//    val number2: Long=number1?.toLong()?:0L //safe call + Elvis 연산

//    val person = Person("심재민")

    val str = """
        ABCD
        EFD
    """.trimIndent()

    val str2 = "ABC"
    println(str2[0])
}

fun printAgeIfPerson(obj: Any){
    if(obj is Person){
        val person = obj as Person
        println(person.name)
    }
}

fun printAgeIfPerson2(obj: Any){
    if(obj !is Person){

    }
}

fun printAgeIfPerson3(obj: Any?){
    if(obj is Person){
        val person = obj as? Person //as뒤에 ?는 null이 아니면 Person으로 바꾸라는 뜻. null이면 person이 null이 될 수 있다.
        println(person?.name) //null이 될 수 있으므로 ?를 추가해야 한다.
    }
}