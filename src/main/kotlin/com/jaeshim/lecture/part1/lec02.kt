package com.jaeshim

import com.jaeshim.lecture.Person
import java.lang.IllegalArgumentException

fun main(){

    var person = Person("jaeshim")

//    //safe call : null이 아닌경우에만 호출하도록 함. null이 들어오면 그냥 null을 리턴시켜줌.
//    val str: String? = "ABC"
//    println(str?.length)
//
//    //Elvis 연산자 : 앞의 연산 결과가 null이면 뒤의 값을 사용한다.
//    val str2: String? = null
//    println(str2?.length ?: 0)
//
//    //null이 들어올 수가 없다고 했는데 null이 들어왔으므로 런타임 에러가 난다
//    println(startsWith(null))
//
//    //Kotlin에서 Java코드를 가져다 사용할 때 어떻게 처리될까?
//    val person = Person("공부하는 개발자")
//    person?.name?.let { startsWithA(it) }

}

fun startsWithA1(str: String?): Boolean {

    //Safe Call + Elvis 연산자 : null인 경우에는 Exception이 던져짐
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
//
//
//    if(str == null){
//        throw IllegalArgumentException("null이 들어왔습니다")
//    }
//
//    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean?{
    return str?.startsWith("A")

//    if(str==null){
//        return null
//    }
//
//    return str.startsWith("A")

}
fun startsWithA3(str: String?): Boolean{
    return str?.startsWith("A")?:false

//    if(str==null){
//        return false
//    }
//    return str.startsWith("A")
}

//절대 null이 아니라고 컴파일러에게 알려줌
fun startsWith(str : String?): Boolean{
    return str!!.startsWith("A")
}

fun startsWithA(str: String):Boolean{
    return str.startsWith("A")
}