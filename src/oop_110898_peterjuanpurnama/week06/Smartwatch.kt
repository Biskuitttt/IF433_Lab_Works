package oop_110898_peterjuanpurnama.week06

class Smartwatch(brand: String) : Watch(brand), Connectable, Trackable {

    override fun showTime() {
        println("Showing time on $brand smartwatch")
    }

    override fun connect() {
        println("Smartwatch connected to phone")
    }

    override fun trackSteps() {
        println("Tracking steps...")
    }

}