package oop_00000110420_Odelynkalista.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    println("Masukan Nama:")
    val name = scanner.nextLine()

    println("Masukan NIM (WAJIB 5 Karakter): ")
    val nim = scanner.nextLine()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        println("Masukan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: pendaftaran Selesai.")
    }
}
