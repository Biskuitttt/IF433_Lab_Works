package oop_110898_peterjuanpurnama.week07

fun main() {
    DatabaseManager.connect()

    val client = NetworkClient.create("https://api.umn.ac.id")
    println(client.baseUrl)

}val u1 = User("A", 20)
val u2 = User("A", 20)

println(u1)
println(u1 == u2) // false

val d1 = UserData("A", 20)
val d2 = UserData("A", 20)

println(d1)
println(d1 == d2) // true