package oop_110898_peterjuanpurnama.week06

fun processCheckout(method: PaymentMethod) {
    method.pay(50000.0)
}

fun main() {

    val gopay = Gopay()
    val card = CreditCard()

    processCheckout(gopay)
    processCheckout(card)

}