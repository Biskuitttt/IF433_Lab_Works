package oop_110898_peterjuanpurnama.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter ->
            println("Musuh: ${event.monsterName}")

        is BattleState.LootDropped ->
            println("Loot: ${event.item.name}")

        is BattleState.GameOver ->
            println("Game Over: ${event.reason}")

        BattleState.SafeZone ->
            println("Zona Aman")
    }
}