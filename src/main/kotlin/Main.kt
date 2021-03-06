fun main() {

    val board = Board(100)
    board.populateBoard()
    val game = Game(board)
    val snakesAndLadders = SnakesAndLadders(64, 54, 70, 80)
    snakesAndLadders.addToSnakeLadderPool()
    val players = Players(
        arrayOf(
            Player("A"),
            Player("B")
        )
    )
    players.apply {
        while (!game.hasWinner(currentPlayer())) {
            nextPlayer()
            val turn = Turn(Dice(6))
            turn.move(currentPlayer())

            snakesAndLadders.updateCurrentSquareWithSnakeLadderIfFound(currentPlayer())

            if (game.hasWinner(currentPlayer())) {
                println("${currentPlayer().name} wins!!!!")
            }
        }
    }
}


