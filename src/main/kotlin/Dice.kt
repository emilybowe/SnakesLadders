import java.security.SecureRandom

//construct dice RNG 1-6
//0 not valid - eliminate 0

class Dice (val bound: Int) : Number {
    override fun generate() : Int{
        val secureRandom = SecureRandom()
        return secureRandom.nextInt(bound)
    }
}