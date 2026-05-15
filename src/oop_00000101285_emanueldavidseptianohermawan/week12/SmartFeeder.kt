package oop_00000101285_emanueldavidseptianohermawan.week12

fun dispenseKibble(
    requestedGram: Int,
    availableGram: Int,
    isJammed: Boolean
): Int {

    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }

    // Validasi hardware dispenser
    if (isJammed) {
        throw DispenserJamException()
    }

    // Validasi stok makanan
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")

    return availableGram - requestedGram
}

fun main() {

    var currentKibbleStock = 50
}