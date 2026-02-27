package oop_00000101285_emanueldavidseptianohermawan.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk() // Memanggil method milik sendiri
    myCar.honk() // Memanggil method yang sudah di-override
    myCar.accelerate() // Memanggil gabungan method Parent dan Child

    println("\n--- Testing Electric Car ---")
    val electricCar = ElectricCar("Tesla", 4, 85)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()

    println("------------")

    val manager = Manager("Budi", 10000000)
    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    println("-------------")

    val developer = Developer("Andi", 8000000, "Kotlin")
    developer.work()
    println("Bonus Manager: ${developer.calculateBonus()}")
}