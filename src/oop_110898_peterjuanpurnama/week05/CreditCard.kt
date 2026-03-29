package oop_110898_peterjuanpurnama.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {

        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran berhasil menggunakan Credit Card oleh $accountName")
        } else {
            println("Transaksi ditolak karena melebihi limit")
        }

    }

}