package oop_110898_peterjuanpurnama.week06

class Gopay : PaymentMethod {

    override fun pay(amount: Double) {
        println("Paid $amount using GoPay")
    }

}

class CreditCard : PaymentMethod {

    override fun pay(amount: Double) {
        println("Paid $amount using Credit Card")
    }

}git add .
git commit -m "week06: create Gopay and CreditCard"