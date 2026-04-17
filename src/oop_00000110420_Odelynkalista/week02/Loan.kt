package oop_00000110420_Odelynkalista.week02

class Loan(val bookTitle: String, val borrower: String, var loanDuration: Int = 1) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) (loanDuration - 3) * 2000 else 0
    }
}

fun main() {
    val sc = java.util.Scanner(System.`in`)
    print("Judul Buku: "); val title = sc.nextLine()
    print("Peminjam: "); val user = sc.nextLine()
    print("Lama Pinjam: "); var dur = sc.nextInt()

    if (dur < 0) dur = 1
    val loan = Loan(title, user, dur)
    println("Denda: Rp ${loan.calculateFine()}")
}
