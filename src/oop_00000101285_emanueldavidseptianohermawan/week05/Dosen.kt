package oop_00000101285_emanueldavidseptianohermawan.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    // WAJIB di-override karena fungsi bekerja() ersifat abstract di Parent
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merivisi RKPS.")
    }

    // Fungsi unik/spesifik yang hanya dimiliki Dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}