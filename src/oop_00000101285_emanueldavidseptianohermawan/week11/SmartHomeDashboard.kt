package oop_00000101285_emanueldavidseptianohermawan.week11

fun main() {

    // Penampung perangkat
    val homeDevices = mutableListOf<SmartDevice>()

    // =========================
    // Konfigurasi Lampu Pintar
    // =========================
    SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}