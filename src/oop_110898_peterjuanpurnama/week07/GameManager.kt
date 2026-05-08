package oop_110898_peterjuanpurnama.week07

object GameManager {
    var isGameRunning = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan!")
        } else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}