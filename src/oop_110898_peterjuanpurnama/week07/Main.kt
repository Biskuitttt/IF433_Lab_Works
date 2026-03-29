package oop_110898_peterjuanpurnama.week07

fun main() {

    DatabaseManager.connect()
    val client = NetworkClient.create("https://api.umn.ac.id")
    println(client.baseUrl)

    val u1 = User("A", 20)
    val u2 = User("A", 20)
    println(u1)
    println(u1 == u2)

    val d1 = UserData("A", 20)
    val d2 = UserData("A", 20)
    println(d1)
    println(d1 == d2)

    val d3 = d1.copy(age = 25)
    val (name, age) = d3
    println(name)
    println(age)

    GameManager.startGame()
    GameManager.startGame()

    println(ItemRarity.LEGENDARY.dropChance)
    val weapon = Weapon.forgeStarterSword()
    println(weapon.item)

    val upgraded = weapon.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgraded))
    processEvent(BattleState.GameOver("Terkena racun"))
}

fun testResponse(res: ApiResponse) {
    val msg = when (res) {
        is ApiResponse.Success -> "OK"
        is ApiResponse.Error -> "Error"
        ApiResponse.Loading -> "Loading..."
    }
    println(msg)
}