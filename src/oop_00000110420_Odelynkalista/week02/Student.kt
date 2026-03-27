package oop_00000110420_Odelynkalista.week02

class Student(
    val name: String,
    val nim: String,
    var major: String
) {
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek student $name berhasil dialokasikan di memory.")
        }
    }
}