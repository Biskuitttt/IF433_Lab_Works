package oop_110898_peterjuanpurnama.week02

class Student(
    val nim: String,
    val name: String,
    var major: String,
    var gpa: Double = 0.0
) {

    init {
        if (nim.length != 10) {
            println("WARNING: NIM harus 10 digit!")
        }

        if (name.isBlank()) {
            println("WARNING: Nama tidak boleh kosong!")
        }

        if (gpa < 0.0 || gpa > 4.0) {
            println("WARNING: IPK tidak valid!")
        }
    }

    constructor(nim: String, name: String) : this(nim, name, "Non-Matriculated", 0.0)

    fun displayInfo() {
        println("===== DATA MAHASISWA =====")
        println("NIM   : $nim")
        println("Nama  : $name")
        println("Jurusan: $major")
        println("IPK   : $gpa")
    }

}
