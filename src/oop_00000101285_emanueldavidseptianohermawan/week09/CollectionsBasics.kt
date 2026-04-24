package oop_00000101285_emanueldavidseptianohermawan.week09

fun main() {
    println("=== TEST LIST ===")
    // Immutable List: Tidak bisa diubah setelah dibuat
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $frameworks")

    // Mutable List: Bisa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Immutable List: $scores")

}