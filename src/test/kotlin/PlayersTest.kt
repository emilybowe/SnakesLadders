import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PlayersTest {
    val playersTest = Players(arrayOf(Player("test1"), Player("test2")))
    val testCurrent: Int = 0

    @Test
    fun currentPlayer() {
        //assertEquals(playersTest[testCurrent],playersTest.currentPlayer())
    }

    @Test
    fun nextPlayer() {
    }
}