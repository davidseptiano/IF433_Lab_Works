package oop_00000101285_emanueldavidseptianohermawan.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // pegawai.mengajar() // INI AKAN ERROR karena tipe referensinya adalah Pegawai
        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast! Tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("----------------------------")
    }

    val math = MathHelper()
    println("Luas persegi: ${math.hitungLuas(4)}")
    println("Luas persegi panjang: ${math.hitungLuas(4,5)}")
    println("Luas lingkaran: ${math.hitungLuas(7.0)}")

    val eWallet = EWallet("DANA", 50000.0)
    val credit = CreditCard("Visa", 100000.0)

    val payments: List<PaymentMethod> = listOf(eWallet, credit)

    // Percobaan pembayaran pertama
    for (p in payments) {
        p.processPayment(75000.0)

        if (p is EWallet) {
            p.topUp(50000.0) // Smart casting untuk menambah saldo
            p.processPayment(75000.0)
        }
    }
}
