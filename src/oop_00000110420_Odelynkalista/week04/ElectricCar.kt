package oop_00000110420_Odelynkalista.week04

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int)
    : Car(brand, numberOfDoors) { // Constructor chaining ke Car [cite: 67, 68]

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}