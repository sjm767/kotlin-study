package com.jaeshim.lecture.part4

fun main(){
// val str ="ABC"
//    println( str.lastChar())

    3.add3(4)
}

fun String.lastChar(): Char{
    return this[this.length-1]
}

val String.lastChar: Char
    get() = this[this.length-1]


open class Train(
    val name: String = "새마을",
    val price: Int = 5000,
)

fun Train.isExpensive(): Boolean {
    println("Train의 확장함수")
    return this.price >= 10000
}

class Srt : Train("SRT",40000)

fun Srt.isExpensive(): Boolean {
    println("Srt의 확장함수")

    return this.price >= 10000

}

fun Int.add(other: Int): Int{
    return this+other
}
infix fun Int.add2(other: Int): Int{
    return this+other
}
inline fun Int.add3(other: Int): Int{
    return this+other
}

