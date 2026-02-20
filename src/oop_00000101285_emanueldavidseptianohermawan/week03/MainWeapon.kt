package oop_00000101285_emanueldavidseptianohermawan.week03

fun main() {
    println("\n=== TEST WEAPON ===")
    val sword = Weapon("Excalibur", 300)

    sword.damage = -50
    sword.damage = 9999

    println("Weapon: ${sword.name}")
    println("Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")

    println("\n=== TEST PLAYER ===")
    val player = Player("Budi")

    // player.xp -> harus error (jangan dihapus dari modul, cukup dikomentari)

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")
}