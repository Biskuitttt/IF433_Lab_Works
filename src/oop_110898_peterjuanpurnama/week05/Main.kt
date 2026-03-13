package oop_nim_nama.week05

fun main() {

    val pegawaiList: List<Pegawai> = listOf(
        Dosen("Budi"),
        Admin("Sinta")
    )

    for (p in pegawaiList) {
        p.bekerja()

        when (p) {
            is Dosen -> p.mengajar()
            is Admin -> p.mengelolaData()
        }
    }

}