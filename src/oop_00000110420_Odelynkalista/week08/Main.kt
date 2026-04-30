package oop_00000110420_Odelynkalista.week08


fun main() {
    println("\n=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val desination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak Diketahui"
    println("Tujuan pengiriman: $desination")
}