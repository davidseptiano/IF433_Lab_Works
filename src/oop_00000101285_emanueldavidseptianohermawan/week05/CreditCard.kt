package oop_00000101285_emanueldavidseptianohermawan.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran $amount berhasil. Sisa limit: ${limit - usedAmount}")
        } else {
            println("Transaksi ditolak. Melebihi limit")
        }
    }
}