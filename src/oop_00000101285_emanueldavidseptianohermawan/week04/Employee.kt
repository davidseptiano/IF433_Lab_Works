package oop_00000101285_emanueldavidseptianohermawan.week04

open class Employee(
    val name: String,
    val baseSalary: Int
) {
    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt()
    }
}