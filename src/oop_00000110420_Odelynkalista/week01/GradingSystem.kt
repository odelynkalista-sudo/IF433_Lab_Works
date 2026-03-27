package oop_00000110420_Odelynkalista.week01

fun main() {
    val name: String = "John thor"
    val score: Int = 80

    println("Grade kamu: $grade")

    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
}
