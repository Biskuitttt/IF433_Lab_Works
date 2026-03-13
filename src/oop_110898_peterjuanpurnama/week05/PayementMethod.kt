package oop_110898_peterjuanpurnama.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)

}