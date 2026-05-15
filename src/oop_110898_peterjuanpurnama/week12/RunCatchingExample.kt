package oop_110898_peterjuanpurnama.week12

fun main() {

    val result = runCatching {

        val number = "100".toInt()
        number / 2
    }

    println(result)
}
fun handleResult() {

    val result = runCatching {
        "abc".toInt()
    }

    val value = result.getOrElse {
        0
    }

    println("Nilai default: $value")

    val recoverResult = result.recover {
        -1
    }

    println(recoverResult.getOrNull())
}