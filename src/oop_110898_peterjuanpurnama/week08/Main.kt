package oop_110898_peterjuanpurnama.week08

fun main() {
    val order = Order(Customer(Address("Jakarta")))
    val city = order.customer?.address?.city ?: "Unknown City"
    println(city)
    order.customer?.address?.city?.let {
        println("City found: $it")
    }
    val mixedData: List<Any> = listOf("Hello", 123, true, "World")
}