package oop_00000101285_emanueldavidseptianohermawan.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750_000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) (price * 80) / 100 else (price * 90) / 100