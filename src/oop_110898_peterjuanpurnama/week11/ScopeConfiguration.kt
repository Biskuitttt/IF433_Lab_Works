package oop_110898_peterjuanpurnama.week11

class User {
    var name: String = ""
    var age: Int = 0
}

fun main() {
    val user = User().apply {
        name = "Peter"
        age = 19
    }

    println(user.name)
    println(user.age)
}
val loggedUser = User().apply {
    name = "Juan"
    age = 20
}.also {
    println("User created: ${it.name}")
}