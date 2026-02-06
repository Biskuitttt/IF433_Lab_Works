package oop_001_johnthor.week01

fun main() {
    var studentName: String = "Budi"
    var score: Int = 80

    if (score >= 85) {
        println("Student: " + studentName + ", Grade: A")
    } else if (score >= 70) {
        println("Student: " + studentName + ", Grade: B")
    } else if (score >= 60) {
        println("Student: " + studentName + ", Grade: C")
    } else {
        println("Student: " + studentName + ", Grade: D")
    }
}
