package oop_110898_peterjuanpurnama.week06

class Button(override val name: String) : Clickable {

    override fun click() {
        println("$name clicked")
    }

}