package com.jaeshim.lecture.part3.objects

class Cat(
    species: String
) : Animal(species,4) {

    override fun move() {
        println("고양이가 걸어가~")
    }
}