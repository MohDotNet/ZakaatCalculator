class Calculator : ICalculate {

    /*** Calculates the amount due and returns the result as a double.
     *
     */
    override fun Calculate(rate: Double, amount: Double): Double {
        return (rate/100) * amount
    }

    /*** Prints a nice message after performing the calculation.
     * Calls Method Calculate and wraps it in a string
     */
    override fun PrintMessage(amount: Double, Rate : Double) : String {
        return "The amount of Zakaat you need to pay is : ${Calculate(Rate,  amount)}"
    }
}