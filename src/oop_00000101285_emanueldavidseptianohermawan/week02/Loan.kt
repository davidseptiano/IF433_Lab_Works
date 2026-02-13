package oop_00000101285_emanueldavidseptianohermawan.week02

class Loan (
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int =
        if (loanDuration > 3)
            (loanDuration - 3) * 2000
        else
            0
}