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
}