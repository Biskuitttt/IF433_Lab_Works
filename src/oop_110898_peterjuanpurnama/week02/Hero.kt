package oop_110898_peterjuanpurnama.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {

    fun attack(targetName: String) {
        println("$name menyerang $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage

        // HP tidak boleh minus
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }

    fun showStatus() {
        println("$name HP tersisa: $hp")
    }

}
