fun main() {
    val amount = 1_000
    val commissionRate = 0.75

    var commission: Int = (amount * commissionRate / 100).toInt()
    commission = if (commission < 35) 35 else commission

    println("Комиссия составит $commission рублей")
}