package com.jaeshim.lecture.part2

fun main(){
//    repeat("Hello World")
    //실수로 파라미터를 잘못 넣을 수도 있다.
    printNameAndGender("FEMALE","jaeshim")

    printNameAndGender(name="jaeshim", gender = "MALE")


    printAll("A","B","C")

    var array = arrayOf("A","B","C")
    printAll(*array)
}


fun max(a: Int, b: Int)=if(a>b)a else b


fun repeat(str: String, num: Int=3,useNewLine: Boolean=true):Unit{
    for(i in 1..num){
        if(useNewLine){
            println(str)
        }else{
            print(str)
        }
    }
}

fun printNameAndGender(name:String, gender: String){
    println(name)
    println(gender)
}

fun printAll(vararg strings: String){
    for(str in strings){
        println(str)
    }
}