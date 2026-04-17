package uts_101285_EmanuelDavidSeptianoHermawan

interface IBillable {
    fun calculateSubtotal(quantity: Int): Double
    fun printMenuDetails(quantity: Int)
}