package oop_110898_peterjuanpurnama.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 15, -3.0, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 10, 8.0, "CLOSED"),
        TradeLog("BNBUSDT", "SHORT", 5, -10.0, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 25, 20.0, "CLOSED")
    )
}