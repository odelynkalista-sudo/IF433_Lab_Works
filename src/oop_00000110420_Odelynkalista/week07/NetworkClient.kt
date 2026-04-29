package oop_00000110420_Odelynkalista.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connected to $url...")
    }
}