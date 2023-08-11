fun main() {
    print("Enter the initial type of temperature: ")
    val typeTemperatureInitial = readln().toString()
    println("Put the value of the temperature: ")
    val valueTemperature = readln().toInt()
    print("Enter a type of temperature to converse that: ")
    val typeTemperatureFinal = readln().toString()

    /*when(typeTemperatureFinal){
        "Kelvin" -> printFinalTemperature(valueTemperature,typeTemperatureInitial,typeTemperatureFinal)
        "Celsius" -> printFinalTemperature()
        "Fahrenheit" ->
        else -> println("That type is not avalable. Temperatures avalables: Kelvin, Celsius, Fahrenheit ")

    }*/
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}