class Turn {
    //$startTurn
    //$player $rollsDice
    //$currentSquare is updated with result of $rollsDice
    //$isSnakeOrLadder checks $currentSquare against $SnakeLadderPool (map implementation)
    //if $currentSquare matches as a key in $SnakeLadderPool
    //the returned value is the new $currentSquare
    //$isWinner checks $currentSquare against $winningSquare
    //if $isWinner == %true% declare winner as $currentPlayer.$name
    //if $isWinner == %false% then ++$currentPlayer, $startTurn
}