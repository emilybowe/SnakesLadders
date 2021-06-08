//$isWinner checks $currentSquare against $winningSquare
//if $isWinner == %true% declare winner as $currentPlayer.$name
//if $isWinner == %false% then ++$currentPlayer, $startTurn

class Game (val board: Board) {

    fun hasWinner(player: Player) :Boolean {
        return player.currentSquare == board.boardSize
    }
}