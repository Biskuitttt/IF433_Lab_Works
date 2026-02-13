package oop_110898_peterjuanpurnama.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
) {

    fun calculateFine(): Int {
        if (loanDuration > 3) {
            return (loanDuration - 3) * 2000
        }
        return 0
    }

}
