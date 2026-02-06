package oop_001_johnthor.week01

fun calculateDiscount(price: Int) =
    if (price > 500_000) price * 80 / 100 else price * 90 / 100

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750_000

    val finalPrice = calculateDiscount(price)
}
