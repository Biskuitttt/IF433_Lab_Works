package oop_110898_peterjuanpurnama.week07

class NetworkClient private constructor(val baseUrl: String) {
    companion object {
        fun create(baseUrl: String): NetworkClient {
            return NetworkClient(baseUrl)
        }
    }
}