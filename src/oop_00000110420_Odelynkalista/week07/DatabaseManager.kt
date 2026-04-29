package oop_00000110420_Odelynkalista.week07

import com.sun.tools.jconsole.JConsoleContext

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}