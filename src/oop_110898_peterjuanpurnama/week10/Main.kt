#!/usr/bin/env kotlin

package oop_110898_peterjuanpurnama.week10

fun main() {

    val intBox = Box(100)
    val stringBox = Box("Hello Kotlin")

    println(intBox.getItem())
    println(stringBox.getItem())
}