/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    println(calculateBMI(40.5,67.7))
}
fun calculateBMI(weightKg: Double, heightM: Double): Double{
    if (weightKg <= 0.0 || heightM <= 0.0) {
        throw IllegalArgumentException("Weight and height must be positive values.")
    }
    val BMI = weightKg /(heightM * heightM)
    return BMI
}

