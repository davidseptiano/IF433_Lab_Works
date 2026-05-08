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

    // =========================
    // Konfigurasi Kamera
    // =========================
    SmartDevice("Ezviz Outdoor", "Camera")
        .apply {
            isOnline = true
            powerLoad = 5
        }
        .also {
            println("(LOG) Kamera terhubung")
            homeDevices.add(it)
        }

    // =========================
    // Konfigurasi AC menggunakan run
    // =========================
    val acUnit = run {
        SmartDevice(
            "Daikin Inverter (Kabel 3x2.5)",
            "HVAC",
            false,
            800
        )
    }

    homeDevices.add(acUnit)

    // =========================
    // Tambah Auto Feeder
    // =========================
    homeDevices.add(
        SmartDevice(
            "Picolo's Auto Feeder",
            "Pet Care",
            true,
            10
        )
    )
}