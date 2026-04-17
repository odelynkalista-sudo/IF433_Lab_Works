package oop_00000110420_Odelynkalista.week02

class Student (
    val name: String,
    val nim: String,
    var major: String = "Non-Matriculated",
    var gpa: Double = 0.0
) {
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }

    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated", 0.0) {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}