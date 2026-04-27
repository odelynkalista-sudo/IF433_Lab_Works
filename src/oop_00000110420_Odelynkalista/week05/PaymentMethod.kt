package oop_00000110420_Odelynkalista.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}