package oop_001_johnthor.week01

fun calculateGrade(score: Int) =
    when {
        score >= 85 -> "A"
        score >= 70 -> "B"
        score >= 60 -> "C"
        else -> "D"
    }

fun main() {
    val studentName = "Budi"
    val score = 80

    val grade = calculateGrade(score)

    println("Student: $studentName, Grade: $grade")
}
