package oop_00000101285_emanueldavidseptianohermawan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")

    print("Nama Hero: ")
    val name = scanner.nextLine()

    print("Damage Hero: ")
    val dmg = scanner.nextInt()

    val hero = Hero(name, dmg)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\nHP Hero: ${hero.hp} | HP Musuh: $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        println("Pilih: ")

        when (scanner.nextInt()) {

            1 -> {
                hero.attack("Monster")
                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0

                println("HP Musuh sekarang: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Monster menyerang balik!")
                    hero.takeDamage(enemyDamage)
                println("Hero menerima $enemyDamage damage!")
                }
            }

            2 -> {
                println("Kamu kabur dari pertarungan!")
                break
            }
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")
    if (hero.hp > 0 && enemyHp == 0)
        println("${hero.name} MENANG!")
    else if (hero.hp == 0)
        println("${hero.name} KALAH...")
    else
        println("Pertarungan dihentikan")
}