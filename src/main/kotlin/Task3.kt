fun main() {
    val amount = 15000
    val isRegularCustomer = true

    var totalAmount: Int

    if (amount >= 0 && amount <= 1000) {
        totalAmount = amount
    } else if (amount >= 1001 && amount <= 10_000) {
        totalAmount = amount - 100
    } else if (amount >= 10_001) {
        totalAmount = (amount * 0.95).toInt()
    } else {
        totalAmount = -1
    }

    if (isRegularCustomer) {
        totalAmount -= (totalAmount * 0.01).toInt()
    }

    println("Стоимость покупки $totalAmount рублей")
}