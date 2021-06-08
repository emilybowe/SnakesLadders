class Player (val name: String)
    //array of players
    //$name of player
    //$currentSquare of player initialised to 0
    //$currentPlayer

    val currentSquare = 0


class Players (val players: Array<Player>) {
    private var current = 0
    fun currentPlayer() = players[current]
    fun nextPlayer() {
        current = if (current == players.lastIndex) 0 else ++current
    }
}

