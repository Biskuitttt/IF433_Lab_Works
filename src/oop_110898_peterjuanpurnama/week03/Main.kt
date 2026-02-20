package oop_110898_peterjuanpurnama.week03

fun main() {

    val e = Employee("Peter", 3000)

    e.salary = -200
    e.salary = 4000

    e.updateRating(4)

    println("Salary: ${e.salary}")
    println("Bonus: ${e.bonus}")

    println("\n=== TEST WEAPON ===")

    val sword = Weapon("Excalibur", 300)

    sword.damage = -50

    sword.damage = 9999

    println("Nama Weapon : ${sword.name}")
    println("Damage      : ${sword.damage}")
    println("Tier        : ${sword.tier}")

    println("\n=== TEST PLAYER LEVELING ===")

    val player = Player("Peter")

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")

}
