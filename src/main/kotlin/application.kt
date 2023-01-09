fun main() {

    println("Starting the Calculator...")

    val calculator = Calculator()

    println("What is the current Zakaat Rate?")
    val inputRate = readln() ?: "0"
    val zakaatRate = inputRate.toDouble()

    println("What is the earnings you wish to calculate upon?")
    val inputEarnings = readln() ?: "0"
    val earningsAmount = inputEarnings.toDouble()

    val amountToPay = calculator.PrintMessage(earningsAmount, zakaatRate)
    println(amountToPay)
}