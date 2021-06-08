class Board(val boardSize: Int) {
    //number container
    //board size passed in
    //board size = $winningSquare

    val board = mutableListOf<Int>()
    fun populateBoard() {
        val boardRange = 1..boardSize
        for (i in boardRange) {
            board.add(i)
        }
    }

}