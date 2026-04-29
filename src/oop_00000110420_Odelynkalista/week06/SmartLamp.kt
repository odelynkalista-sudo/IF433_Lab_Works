package oop_00000110420_Odelynkalista.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu $name ($id) dinyalakan.")
    }

    override fun turnOff() {
        println("Lampu $name ($id) dimatikan.")
    }
}