package oop_110898_peterjuanpurnama.week12

class InsufficientFundsException :
    Exception("Saldo tidak mencukupi")

class BankAccount(var balance: Int) {

    fun withdraw(amount: Int) {

        if (amount > balance) {
            throw InsufficientFundsException()
        }

        balance -= amount
        println("Berhasil tarik uang Rp$amount")
        println("Sisa saldo: Rp$balance")
    }
}