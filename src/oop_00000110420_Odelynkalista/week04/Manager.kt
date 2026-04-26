package oop_00000110420_Odelynkalista.week04

class Manager (name: String, baseSalary: Int) : Employee(name, baseSalary) {
        [cite: 86]

        override fun work() {
            println("$name sedang memimpin rapat divisi.")
        }

        override fun calculateBonus(): Int {
            return super.calculateBonus() + 500000
        }
    }
