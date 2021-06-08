//number container
//board size passed in
//board size = $winningSquare

class Board(val boardSize: Int) {
    val boardNumbers = mutableListOf<Int>()

    fun populateBoard() {
        val boardRange = 1..boardSize
        for (i in boardRange) {
            boardNumbers.add(i)
        }
    }

}