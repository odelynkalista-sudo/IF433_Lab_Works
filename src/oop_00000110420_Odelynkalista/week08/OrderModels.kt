package oop_00000110420_Odelynkalista.week08

class City(val name: String)
class Address(val city: String)
class DeliveryDetails(val address: Address?)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int)