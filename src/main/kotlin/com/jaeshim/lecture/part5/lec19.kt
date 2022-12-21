package com.jaeshim.lecture.part5


class Person(
    val name:String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }
    operator fun component2(): Int {
        return this.age
    }

}


fun main(){
//    val person = Person("jaeshim",100)
//    val (name,age) = person
//
//    println("이름: ${name}, 나이: ${age}")


    val numbers = listOf(1,2,3,4,5)
//    numbers.map {number -> number+1}.forEach { number -> println(number)}

//    for(number in numbers){
//        if(number == 2){
//            break
//        }
//    }

    //break
//    run {
//        numbers.forEach { number ->
//            if (number == 2) {
//                return@run
//            }
//        }
//    }
//
//    //continue
//    numbers.forEach { number ->
//        if (number == 2) {
//            return@forEach
//        }
//    }

    loop@for(i in 1..100){
        for(j in 1..100){
            if(j==2){
                break@loop
            }
            print("${i} ${j}")
        }

    }

}
