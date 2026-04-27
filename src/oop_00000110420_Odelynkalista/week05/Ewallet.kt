package oop_00000110420_Odelynkalista.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet sebesar $amount berhasil. Sisa saldo: $balance")
        } else {
            println("[$accountName] Saldo tidak cukup untuk membayar $amount.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top Up berhasil! Saldo sekarang: $balance")
    }
}