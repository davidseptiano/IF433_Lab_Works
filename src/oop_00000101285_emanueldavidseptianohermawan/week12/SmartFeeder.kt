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

    // Jadwal Makan 1 - Multiple Catch
    try {

        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )

        println("Sisa stok: $currentKibbleStock gr")

    } catch (e: DispenserJamException) {

        println("ERROR DISPENSER: ${e.message}")

    } catch (e: FoodEmptyException) {

        println("ERROR STOK: ${e.message}")

    } catch (e: Exception) {

        println("ERROR UMUM: ${e.message}")

    } finally {

        println("Siklus pengecekan dispenser pagi selesai.")
    }

    // Jadwal Makan 2 - runCatching
    runCatching {

        dispenseKibble(
            requestedGram = 30,
            availableGram = 1000,
            isJammed = false
        )
    }.onSuccess { newStock ->

        currentKibbleStock = newStock

        println(
            "Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr"
        )

    }
}