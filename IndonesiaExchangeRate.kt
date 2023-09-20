fun main() {
    println(exchangetoIDR(1000))
}
fun exchangetoIDR(peso: Int): Int {
    if(peso <= 0) {
        throw IllegalArgumentException("You have no money")
    }
    val Rupiah = 270 * peso
    return Rupiah
}
