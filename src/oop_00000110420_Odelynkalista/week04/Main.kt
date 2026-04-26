package oop_00000110420_Odelynkalista.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myEV = ElectricCar(brand = "Tesla", numberOfDoors = 2, batteryCapacity = 85)
    myEV.openTrunk()
    myEV.honk()
    myEV.accelerate()

    println("\n--- Testing Employee Hierarchy ---")

    val manager = Manager("Budi", 8000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    val developer = Developer("Alice", 7000000, "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}