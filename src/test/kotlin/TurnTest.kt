import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class TurnTest{
    private val testTurn = Turn(FixedNumber(6))
    private val testPlayer = Player("test")

    @Test
    fun move() {
        testPlayer.currentSquare = 0
        testTurn.move(testPlayer)
        assertEquals(6, testPlayer.currentSquare)
    }
}