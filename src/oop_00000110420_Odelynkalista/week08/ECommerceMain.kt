package oop_00000110420_Odelynkalista.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Waranty korup
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // ID Hilang!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Tipe tidak dikenal
    )

    val parser = ApiParser()

    println("=== STARTING E-COMMERCE PIPELINE ===")

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                println("Berhasil Parsing: ${it.name}")
                parser.checkout(it)
            } ?: println("Log: Produk di-skip karena tipe tidak dikenal.")

        } catch (e: IllegalArgumentException) {
            println("Peringatan: ${e.message}")
        }
        println("-------------------")
    }
}