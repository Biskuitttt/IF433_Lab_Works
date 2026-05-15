try {

    currentKibbleStock = dispenseKibble(
        requestedGram = 80,
        availableGram = currentKibbleStock,
        isJammed = false
    )

} catch (e: DispenserJamException) {

    println(e.message)

} catch (e: FoodEmptyException) {

    println(e.message)

} catch (e: Exception) {

    println(e.message)

} finally {

    println("Siklus pengecekan dispenser pagi selesai.")
}