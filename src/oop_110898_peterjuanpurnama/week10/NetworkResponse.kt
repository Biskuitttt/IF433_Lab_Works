package oop_110898_peterjuanpurnama.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)