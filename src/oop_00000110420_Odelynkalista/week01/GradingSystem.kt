package oop_00000110420_Odelynkalista.week01

fun main() {
    val name: String = "John thor"
    val score: Int = 80

    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
    println( "Status: ${calculateStatus(score)}")

    val studentId: String? = null

    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidek Lulus"