import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class BoardTest {

    @Test
    fun populateBoardTest() {
        val testSize = 3
        val testBoard1 = Board(testSize)
        val testBoard2 = Board(testSize)

        testBoard2.boardNumbers.add(1)
        testBoard2.boardNumbers.add(2)
        testBoard2.boardNumbers.add(3)
        testBoard1.populateBoard()
        assertTrue(testBoard1.equals(testBoard2))
    }
}