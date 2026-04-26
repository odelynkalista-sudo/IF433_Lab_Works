package oop_00000110420_Odelynkalista.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("\n--- Test Tugas 1: Weapon ---")
    val sword = Weapon("Excalibur")

    sword.damage = -50
    sword.damage = 9999
    println("Weapon: ${sword.name}, Damage: ${sword.damage}, Tier: ${sword.tier}")
}

