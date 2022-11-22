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

