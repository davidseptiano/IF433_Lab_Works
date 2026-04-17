package uts_101285_EmanuelDavidSeptianoHermawan

class DrinkMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val isLargeSize: Boolean
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        val price = if (isLargeSize) basePrice + 5000 else basePrice
        return price * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val subtotal = calculateSubtotal(quantity)
        val size = if (isLargeSize) "Large" else "Regular"
        println("[DRINK] $menuCode - $name ($size)")
        println("   Qty: $quantity cups | Subtotal: Rp $subtotal")
    }
}