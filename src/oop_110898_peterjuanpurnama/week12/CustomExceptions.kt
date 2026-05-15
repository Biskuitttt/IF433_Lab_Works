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

fun main() {

    val account = BankAccount(50000)

    try {

        account.withdraw(100000)

        val number = "abc".toInt()

    } catch (e: InsufficientFundsException) {

        println("Custom Error: ${e.message}")

    } catch (e: NumberFormatException) {

        println("Format angka salah")

    } catch (e: Exception) {

        println("General Error: ${e.message}")
    }
}