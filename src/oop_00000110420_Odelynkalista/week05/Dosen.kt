package oop_00000110420_Odelynkalista.week05

import oop_00000110420_Odelynkalista.week04.Car

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}