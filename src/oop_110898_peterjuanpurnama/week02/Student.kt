package oop_110898_peterjuanpurnama.week02

class Student(
    val nim: String,
    val name: String,
    var major: String
) {

    fun displayInfo() {
        println("===== DATA MAHASISWA =====")
        println("NIM   : $nim")
        println("Nama  : $name")
        println("Jurusan: $major")
    }

}
