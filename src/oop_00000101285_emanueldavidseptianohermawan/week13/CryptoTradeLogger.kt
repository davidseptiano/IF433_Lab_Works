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