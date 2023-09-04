fun main() {
    var initialMeasurement: Double = 20.0

    printFinalTemperature(initialMeasurement,"Celsius","Fahrenheit", ::celsiusToFahrenheit)
    printFinalTemperature(initialMeasurement, "Kelvin", "Celsius", ::kelvinToCelsius)
    printFinalTemperature(initialMeasurement,"Fahrenheit","Kelvin", ::fahrenheitToKelvin)
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

fun celsiusToFahrenheit(celsius: Double): Double {
    return 1.8 * (celsius) + 32 // 9 / 5  = 1.8
}

fun kelvinToCelsius(kelvin: Double): Double {
    return kelvin - 273.15
}

fun fahrenheitToKelvin(fahrenheit: Double): Double {
    return 0.56 * (fahrenheit - 32) + 273.15  // 5 / 9 = 0.55555... = 0.56
}

