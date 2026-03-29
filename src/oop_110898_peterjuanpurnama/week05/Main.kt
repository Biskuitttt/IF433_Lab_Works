package oop_110898_peterjuanpurnama.week05

fun main() {

    val pegawaiList: List<Pegawai> = listOf(
        Dosen("Budi"),
        Admin("Sinta")
    )

    for (p in pegawaiList) {
        p.bekerja()

        when (p) {
            is Dosen -> p.mengajar()
            is Admin -> p.mengelolaData()
        }
    }
    val math = MathHelper()

    println("Luas Persegi: ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${math.hitungLuas(4,6)}")
    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

    val wallet = EWallet("Peter", 50000.0)
    val creditCard = CreditCard("Peter", 100000.0)

    val payments: List<PaymentMethod> = listOf(wallet, creditCard)

    for (method in payments) {
        method.processPayment(75000.0)
    }
    for (method in payments) {

        method.processPayment(75000.0)

        if (method is EWallet) {
            method.topUp(50000.0)
            method.processPayment(75000.0)
        }

    }
}