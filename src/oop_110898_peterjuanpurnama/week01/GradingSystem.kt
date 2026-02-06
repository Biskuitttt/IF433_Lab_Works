package oop_001_johnthor.week01

fun calculateGrade(score: Int?) =
    when {
        score == null -> "No Score"
        score >= 85 -> "A"
        score >= 70 -> "B"
        score >= 60 -> "C"
        else -> "D"
    }

fun main() {
    val studentName = "Budi"
    val score: Int? = null   // coba ganti 80 kalau mau tes

    val grade = calculateGrade(score ?: 0)

    println("Student: $studentName, Grade: $grade")
}
