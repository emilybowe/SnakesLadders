class FixedNumber(private val fixedNumber: Int) : Number {
    override fun generate(): Int {
        return fixedNumber
    }
}