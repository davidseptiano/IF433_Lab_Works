package oop_00000101285_emanueldavidseptianohermawan.week10

fun main() {

    // Initialize coin repository
    val coinRepo = WalletRepository<Coin>()

    // Populate coin repository
    coinRepo.add(Coin("BTC", 0.25))
    coinRepo.add(Coin("ETH", 2.5))
    coinRepo.add(Coin("USDT", 1500.0))
}