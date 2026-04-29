package oop_00000110420_Odelynkalista.week07

fun main() {
    println("=== TESTING SINGLETON ===")
    println("Statis: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}