package oop_nim_nama.week05

class Admin(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang bekerja sebagai admin.")
    }

    fun mengelolaData() {
        println("$nama sedang mengelola data akademik.")
    }
}