package oop_00000110420_Odelynkalista.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", nidn = "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIFITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }
    val math = MathHelper()
    println("\n=== TESTING OVERLOADING (TASK 1) ===")
    println("Luas Persegi (sisi 5): ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang (5x10): ${math.hitungLuas(5, 10)}")
    println("Luas Lingkaran (r 7.0): ${math.hitungLuas(7.0)}")

    println("\n=== SISTEM PEMBAYARAN (TASK 2) ===")
    val myEWallet = EWallet("Odelyn E-Wallet", 50000.0)
    val myCreditCard = CreditCard("Odelyn Visa", 100000.0)

    val listPembayaran: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    for (pay in listPembayaran) {
        println("--- Memproses akun: ${pay.accountName} ---")
        pay.processPayment(75000.0)

        if (pay is EWallet) {
            println("Mendeteksi E-Wallet, mencoba auto top-up...")
            pay.topUp(50000.0)
            pay.processPayment(75000.0)

        }
    }
}