package helloworld

class App {
    companion object {
        fun init() {
            println("Hello World!")
        }
    }
}

fun main(args: Array<String>) {
    App.init();
    for(arg in args) {
        println(arg)
    }
}
