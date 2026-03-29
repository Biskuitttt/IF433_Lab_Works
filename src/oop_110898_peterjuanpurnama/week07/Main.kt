fun main() {
    DatabaseManager.connect()

    val client = NetworkClient.create("https://api.umn.ac.id")
    println(client.baseUrl)
}