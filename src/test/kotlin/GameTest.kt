import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GameTest {

    @Test
    fun hasWinnerTrue() {
        val testBoard = Board(10)
        val game = Game(testBoard)
        val testPlayer = Player("Test")
        testPlayer.currentSquare = 10

        assertEquals(true, game.hasWinner(testPlayer))
    }

    @Test
    fun hasWinnerFalse() {
        val testBoard = Board(10)
        val game = Game(testBoard)
        val testPlayer = Player("Test")
        testPlayer.currentSquare = 9

        assertNotEquals(true, game.hasWinner(testPlayer))
    }

}