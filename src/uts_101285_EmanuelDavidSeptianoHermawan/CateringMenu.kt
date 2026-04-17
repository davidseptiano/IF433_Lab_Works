package uts_101285_EmanuelDavidSeptianoHermawan

abstract class CateringMenu (
    val name: String,
    menuCodeInput: String,
    basePriceInput: Double
) : IBillable {

    var menuCode: String = menuCodeInput
        set(value) {
            field = value.uppercase()
        }
        get() {
            return "UMN-$field"
        }

    var basePrice: Double = basePriceInput
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("[Error] Invalid price")
            }
        }

    abstract override fun calculateSubtotal(quantity: Int): Double
    abstract override fun printMenuDetails(quantity: Int)
}
