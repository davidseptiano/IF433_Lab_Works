package oop_00000101285_emanueldavidseptianohermawan.week10

data class Coin(
    override val name: String,
    val balance: Double
) : NamedEntitiy

data class Transaction (
    val id: String,
    val amount: Double
)