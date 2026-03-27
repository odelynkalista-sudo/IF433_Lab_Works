package oop_00000110420_Odelynkalista.week01

fun main() {
    val gameTitle = "Game A"
    val price = 600000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 80) / 100
    else (price * 90) / 100