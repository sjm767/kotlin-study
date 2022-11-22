package com.jaeshim.lecture.part3


fun main(){

    val person = PersonDto("jaeshim",100)
    val person2 = PersonDto("jaeshim",200)

    println(person == person2) //equals
    println(person) //toString
}
enum class Country(
    private val code: String,
)
{
    KOREA(code = "KO"),
    AMERICA(code = "US")
    ;
}
fun handleCountry(country: Country){
    when(country){
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

data class PersonDto(
    val name: String,
    val age:Int,
)

sealed class  HyundaiCar(
    val name:String,
    val price: Long
)

class Avante : HyundaiCar("아반떼",1000L)
class Sonata : HyundaiCar("쏘나타",1000L)
class Grandeur : HyundaiCar("그랜져",1000L)

private fun handleCar(car: HyundaiCar){
    when(car){
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}