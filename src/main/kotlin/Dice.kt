import java.security.SecureRandom

//construct dice RNG 1-6

class Dice (val bound: Int) : Number {
    override fun generate() : Int{
        val secureRandom = SecureRandom()
        return secureRandom.nextInt(bound)
    }
}