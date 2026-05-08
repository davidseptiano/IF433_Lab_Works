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
}