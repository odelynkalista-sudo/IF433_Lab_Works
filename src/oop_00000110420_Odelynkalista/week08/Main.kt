package oop_00000110420_Odelynkalista.week08


fun main() {
    println("\n=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val desination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak Diketahui"
    println("Tujuan pengiriman: $desination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->

        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: $tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)
}