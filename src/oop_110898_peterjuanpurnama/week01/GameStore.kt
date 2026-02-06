package oop_001_johnthor.week01

fun calculateDiscount(price: Int) =
    if (price > 500_000) price * 80 / 100 else price * 90 / 100

fun printReceipt(
    title: String,
    finalPrice: Int,
    userNote: String?
) {
    val note = userNote ?: "Tidak ada catatan"

    println("=== SteamKW Receipt ===")
    println("Game Title : $title")
    println("Final Price: Rp $finalPrice")
    println("Note       : $note")
}

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750_000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        userNote = userNote
    )
}
