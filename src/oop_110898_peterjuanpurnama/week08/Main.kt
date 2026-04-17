package oop_110898_peterjuanpurnama.week08

fun main() {
    val order = Order(Customer(Address("Jakarta")))
    val city = order.customer?.address?.city ?: "Unknown City"
    println(city)
    order.customer?.address?.city?.let {
        println("City found: $it")
    }
    val mixedData: List<Any> = listOf("Hello", 123, true, "World")
    for (item in mixedData) {
        val text = item as? String ?: "Not a String"
        println(text)
    }
    val name: String? = null
    val safeName = requireNotNull(name) { "Name cannot be null" }
    println(safeName.length)
    val data = LegacyJavaAPI.getData()!!
    println(data)
}