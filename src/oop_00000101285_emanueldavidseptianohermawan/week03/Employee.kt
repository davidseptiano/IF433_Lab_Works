package oop_00000101285_emanueldavidseptianohermawan.week03

class Employee(val name: String) {
    val tax: Double
        get() = salary * 0.1

    var salary: Int = 0
        set(value) {
            field = if (value < 0) 0 else value
        }

    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}