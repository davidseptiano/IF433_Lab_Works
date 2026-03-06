package oop_00000101285_emanueldavidseptianohermawan.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}