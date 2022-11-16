package com.jaeshim.lecture.part3.objects

//class Penguin(
//    species: String
//) : Animal(species,2) {
//
//    private val wingCount: Int = 2
//
//    override fun move() {
//        println("펭귄이 움직입니다")
//    }
//
//    override val legCount: Int
//        get() = super.legCount + wingCount
//}

class Penguin(
    species: String
) : Animal(species,2), Swimmable,Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다")
    }

    override val legCount: Int
        get() = super.legCount + wingCount

    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act()
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

    override val swimAbility: Int
        get() =3

}