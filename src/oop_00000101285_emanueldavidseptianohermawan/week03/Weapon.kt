package oop_00000101285_emanueldavidseptianohermawan.week03

class Weapon(val name: String, damage: Int) {

    var damage: Int = damage
        set(value) {
            when {
                value < 0 -> {
                    println("WARNING: Damage tidak boleh negatif! Nilai tidak diubah.")
                }
                value > 1000 -> {
                    println("WARNING: Damage terlalu besar! Diset ke 1000.")
                    field = 1000
                }
                else -> field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}