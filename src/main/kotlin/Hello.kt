fun main() {
    val temperature = 10
    val isHot = if (temperature > 20) true else false
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK"
    }."
    println(message)
}

