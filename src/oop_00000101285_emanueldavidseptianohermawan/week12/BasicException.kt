package oop_00000101285_emanueldavidseptianohermawan.week12

fun divide(a: Int, b: Int): Int {
    try {
        return a / b
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        return -1
    } finally {
        println("Division attempt finished")
    }
}

fun main() {
    println("=== TEST TRY AS EXPRESSION ===")
    val inputString = "123A"

    // try langsung mengembalikan hasil parsing, atau -1 jika gagal
    val result: Int = try {
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException) {
        -1
    }

    println("Hasil parsing: $result")

    println("\n=== TEST MULTIPLE CATCH ===")
    val account = BankAccount(100.0)

    try {
        account.withdraw(150.0) // Ini akan memicu InsufficientFundsException
    } catch (e: InsufficientFundsException) {
        println("Caught Domain Error: Uang tidak cukup. ${e.message}")
    } catch (e: IllegalArgumentException) {
        println("Caught Argument Error: Input tidak valid. ${e.message}")
    } catch (e: Exception) {
        println("Caught General Error: Terjadi kesalahan tidak terduga.")
    }
}