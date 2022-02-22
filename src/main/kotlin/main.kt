val scan = java.util.Scanner(System.`in`)
fun main() {
    println("Введите сумму в копейках:")
    val amount = scan.nextFloat()
    val commission = if (amount * 0.0075 < 35000) {
        35000
    } else {
        amount * 0.0075
    }
    println("Комиссия = $commission копеек")


}