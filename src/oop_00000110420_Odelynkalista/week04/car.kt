package oop_00000110420_Odelynkalista.week04

open class car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}