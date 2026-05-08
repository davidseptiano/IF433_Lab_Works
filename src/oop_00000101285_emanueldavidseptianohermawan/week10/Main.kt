package oop_00000101285_emanueldavidseptianohermawan.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isis stringBoc: ${stringBox.value}")
}