package oop_110898_peterjuanpurnama.week05

class Admin(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang bekerja sebagai admin.")
    }

    fun mengelolaData() {
        println("$nama sedang mengelola data akademik.")
    }
}