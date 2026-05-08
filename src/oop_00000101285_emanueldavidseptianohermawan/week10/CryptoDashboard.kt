package oop_00000101285_emanueldavidseptianohermawan.week10

fun main() {

    // Initialize coin repository
    val coinRepo = WalletRepository<Coin>()

    // Populate coin repository
    coinRepo.add(Coin("BTC", 0.25))
    coinRepo.add(Coin("ETH", 2.5))
    coinRepo.add(Coin("USDT", 1500.0))

    // Wrap repository data into ApiRepository
    val response = ApiResponse(
        "200 OK",
        coinRepo.getAll()
    )

    // Print dashboard
    println("=== CRYPTO DASHBOARD ===")
    println("Response Status: ${response.status}")
    println()

    response.data.forEach { coin ->
        println("Coin: ${coin.name}")
        println("Balance: ${coin.balance}")
        println()
    }

    // Search demo
    println("=== SEARCH RESULT ===")
    val searchResult = coinRepo.searchByName("BT")

    searchResult.forEach {
        println(it)
    }

    println()

    // Transaction repository
    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 250000.0))
    txRepo.add(Transaction("TX002", 125000.0))
    txRepo.add(Transaction("TX003", 500000.0))

    println("=== TRANSACTION LIST ===")

    txRepo.getAll().forEach { tx ->
        println("Transaction ID: ${tx.id}")
        println("Amount: ${tx.amount}")
        println()
    }
}