package uts_101285_EmanuelDavidSeptianoHermawan

class CateringOrder(val customer: Customer) {

    var status: OrderStatus = OrderStatus.WAITING_LIST

    private val orderItems: MutableList<Pair<CateringMenu, Int>> = mutableListOf()

    fun addMenuToOrder(menu: CateringMenu, qty: Int) {
        orderItems.add(Pair(menu, qty))
        println("Order successfully added!")
    }

    fun printInvoice() {
        println("\n================ INVOICE ================")
        println("Customer: ${customer.name} (${customer.phone})")
        println("Delivery Address: ${customer.deliveryAddress}")
        println("Order Status: $status\n")

        var grandTotal = 0.0

        for ((index, item) in orderItems.withIndex()) {
            val (menu, qty) = item
            print("${index + 1}. ")
            menu.printMenuDetails(qty)
            grandTotal += menu.calculateSubtotal(qty)
        }

        println("-----------------------------------------")
        println("GRAND TOTAL: Rp $grandTotal")
        println("=========================================")
    }
}