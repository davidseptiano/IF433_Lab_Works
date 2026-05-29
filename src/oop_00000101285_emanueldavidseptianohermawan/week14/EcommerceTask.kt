package oop_00000101285_emanueldavidseptianohermawan.week14

import java.io.File

// ==========================
// DIP & SRP - Repository
// ==========================
interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository(private val file: File) : OrderRepository {

    override fun saveOrder(
        itemName: String,
        finalPrice: Double,
        customerType: String
    ) {

        file.bufferedWriter().use { writer ->
            writer.append("$itemName,$finalPrice,$customerType\n")
        }
    }
}

// ==========================
// DIP & SRP - Notification
// ==========================
interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {

    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

// ==========================
// OCP - Pricing Strategy
// ==========================
interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price
    }
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

// ==========================
// Main Processor
// ==========================
class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        customerType: String,
        pricingStrategy: PricingStrategy
    ) {

        val finalPrice = pricingStrategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, customerType)

        notifier.sendNotification(
            "Pesanan $itemName Anda telah dikonfirmasi!"
        )
    }
}

// ==========================
// Main Function
// ==========================
fun main() {

    val repository = CsvOrderRepository(File("orders.csv"))
    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(repository, notifier)

    processor.processOrder(
        itemName = "Laptop",
        basePrice = 10000000.0,
        customerType = "VIP",
        pricingStrategy = VipPricing()
    )

    processor.processOrder(
        itemName = "Mouse",
        basePrice = 250000.0,
        customerType = "REGULAR",
        pricingStrategy = RegularPricing()
    )
}