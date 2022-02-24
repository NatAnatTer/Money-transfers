val scan = java.util.Scanner(System.`in`)
fun main() {
    val minSum = 35000
    println("Введите сумму в копейках:")
    val amount = scan.nextFloat()
    val commission = if (amount * 0.0075 < minSum) {
        minSum
    } else {
        amount * 0.0075
    }
    println("Комиссия = $commission копеек")


}