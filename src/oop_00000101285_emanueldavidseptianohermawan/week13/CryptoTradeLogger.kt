package oop_00000101285_emanueldavidseptianohermawan.week13
import java.io.File
import java.io.FileNotFoundException

// 1. Model Data
data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

// 2. Serialization (Extension Function)
fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

// 3 & 4. Deserialization + Error Handling
fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")

        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

// 5. Write System
fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach {
            writer.println(it.toCsv())
        }
    }
}

// 6. Load System (Safe Skip)
fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path)
            .readLines()
            .mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("(Log) File tidak ditemukan.")
        emptyList()
    }
}

// 7 - 10. Main Program
fun main() {

    // Mock Data
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 1000.0, 120.5),
        TradeRecord(2, "ETHUSDT", "Short", 800.0, -35.2),
        TradeRecord(3, "SOLUSDT", "Long", 500.0, 75.0)
    )

    // Save to CSV
    saveTrades(trades, "crypto_trades.csv")

    // Inject malformed data
    File("crypto_trades.csv")
        .appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
}