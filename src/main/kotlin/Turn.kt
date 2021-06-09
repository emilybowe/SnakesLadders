//$isSnakeOrLadder checks $currentSquare against $SnakeLadderPool (map implementation)
//if $currentSquare matches as a key in $SnakeLadderPool
//the returned value is the new $currentSquare

class Turn(private val number: Number) {
    val diceRoll = number.generate()

    fun move(player: Player) {
        player.currentSquare += diceRoll
    }

}

