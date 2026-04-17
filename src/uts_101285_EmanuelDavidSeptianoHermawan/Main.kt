package uts_101285_EmanuelDavidSeptianoHermawan

import java.util.Scanner

fun main() {

    println("=== UMN CATERING MANAGER SYSTEM ===")

    // ========================
    // PHASE 1: DATABASE
    // ========================
    println("[Database Setup] Adding Nasi Goreng Spesial...")

    val nasiGoreng = FoodMenu("Nasi Goreng Spesial", "nsg01", 0.0)
    nasiGoreng.basePrice = -15000.0 // error
    nasiGoreng.basePrice = 25000.0  // fix

    println("[Database Setup] Price updated to Rp ${nasiGoreng.basePrice}")

    val ayamBakar = FoodMenu("Ayam Bakar Madu", "aym02", 35000.0)

    val esTeh = DrinkMenu("Es Teh Lemon", "lem01", 8000.0, true)

    val menuList: List<CateringMenu> = listOf(nasiGoreng, ayamBakar, esTeh)

    // ========================
    // PHASE 2: INPUT CUSTOMER
    // ========================
    val scanner = Scanner(System.`in`)

    println("\n--- CUSTOMER DATA INPUT ---")
    print("Enter Customer Name: ")
    val name = scanner.nextLine()

    print("Enter Phone Number: ")
    val phone = scanner.nextLine()

    print("Enter Delivery Address: ")
    val address = scanner.nextLine()

    val customer = Customer(name, phone, address)
    val order = CateringOrder(customer)

    // ========================
    // PHASE 3: ORDER LOOP
    // ========================
    while (true) {
        println("\n--- MENU CATALOG ---")
        for ((i, menu) in menuList.withIndex()) {
            println("${i + 1}. ${menu.name}")
        }
        println("0. [FINISH & CHECKOUT]")

        print("Select Menu Number: ")
        val choice = scanner.nextInt()

        if (choice == 0) {
            println("Processing Checkout...")
            break
        }

        if (choice in 1..menuList.size) {
            print("Enter Quantity: ")
            val qty = scanner.nextInt()

            val selectedMenu = menuList[choice - 1]
            order.addMenuToOrder(selectedMenu, qty)
        } else {
            println("Invalid menu choice!")
        }
    }

    // ========================
    // PHASE 4: INVOICE
    // ========================
    order.status = OrderStatus.COOKING
    order.printInvoice()
}