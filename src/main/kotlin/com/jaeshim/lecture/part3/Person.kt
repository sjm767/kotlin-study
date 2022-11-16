package com.jaeshim.lecture.part3

import java.lang.IllegalArgumentException


class Person (
    val name: String="jaeshim",
    var age: Int=1){

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
}