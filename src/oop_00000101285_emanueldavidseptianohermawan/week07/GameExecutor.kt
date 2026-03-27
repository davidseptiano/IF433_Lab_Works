package oop_00000101285_emanueldavidseptianohermawan.week07

fun processEvent(event: BattleState) {

    when (event) {

        is BattleState.MonsterEncounter -> {
            println("Musuh muncul: ${event.monsterName}!")
        }

        is BattleState.LootDropped -> {
            println("Loot didapat: ${event.item.name} (${event.item.rarity}")
        }

        is BattleState.GameOver -> {
            println("GAME OVER: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Kamu berada di zona aman.")
        }
    }
}