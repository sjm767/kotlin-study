package com.jaeshim.lecture.part3.objects

import java.lang.IllegalArgumentException


class Person (
    name: String="jaeshim",
    var age: Int=1){

//    fun getUppercaseName(): String{
//        return this.name.uppercase()
//    }

//    val uppercaseName: String
//        get() = this.name.uppercase()


    //setter
    var name = name
        set(value){
            field = value.uppercase()
        }


    //클래스가 초기화될 때 한 번 실행되는 블록
    init{
        if(age <= 0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }
    constructor(name: String): this(name,1){
        println("첫번째 부생성자")
    }
    //파라미터가 없는 부생성자. 첫번째 생성자를 호출 한 후 최종적으로 주생성자가 호출된다.
    constructor() : this("jaeshim"){
        println("두번째 부생성자")
    }

//    fun isAdult(): Boolean{
//        return this.age>=20
//    }

//    val isAdult: Boolean
//        get() = this.age >= 20
      val isAdult: Boolean
            get() {
                return this.age >= 20
            }
}