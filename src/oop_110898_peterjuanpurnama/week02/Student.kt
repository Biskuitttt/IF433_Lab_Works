package oop_110898_peterjuanpurnama.week02

class Student(
    val nim: String,
    val name: String,
    var major: String
) {

    init {
        if (nim.length != 10) {
            println("WARNING: NIM harus 10 digit!")
        }

        if (name.isBlank()) {
            println("WARNING: Nama tidak boleh kosong!")
        }
    }

    // Secondary Constructor
    constructor(nim: String, name: String) : this(nim, name, "Non-Matriculated")

    fun displayInfo() {
        println("===== DATA MAHASISWA =====")
        println("NIM   : $nim")
        println("Nama  : $name")
        println("Jurusan: $major")
    }

}
