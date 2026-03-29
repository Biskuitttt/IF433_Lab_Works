package oop_110898_peterjuanpurnama.week05

class Dosen(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang bekerja sebagai dosen.")
    }

    fun mengajar() {
        println("$nama sedang mengajar mahasiswa.")
    }
}