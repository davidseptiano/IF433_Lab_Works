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
