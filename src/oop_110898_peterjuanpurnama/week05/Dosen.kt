package oop_nim_nama.week05

class Dosen(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang bekerja sebagai dosen.")
    }

    fun mengajar() {
        println("$nama sedang mengajar mahasiswa.")
    }
}