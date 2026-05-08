package oop_00000101285_emanueldavidseptianohermawan.week11

fun main() {
    println("=== TEST EXTENSION FUNCTION ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}") // 'this' bisa dihilangkan (implicit)
        length * 2
    }
    println("Hasil kalkulasi run: $result")
}