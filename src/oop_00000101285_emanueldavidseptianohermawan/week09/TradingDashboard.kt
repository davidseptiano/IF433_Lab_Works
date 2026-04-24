package oop_00000101285_emanueldavidseptianohermawan.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 15, 8.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, -2.5, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 12.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 25, -10.0, "CLOSED")
    )

    // ✅ Pipeline 1
    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }
}