class SnakesAndLaddersFactory (val snakeStart: Int, val snakeEnd: Int, val ladderStart:Int, val ladderEnd: Int) {
    //construct snakes and ladders
    //could randomise with pools: - low pool bottom 30% of board size and high pool top 30 % of board size
    //could randomise with manual seeds and add/decrement 5-10 cells
    //could be passed in randomly
    //**could separate out into SnakeFactory: Factory and LadderFactory:Factory


    val snakeLadderPool = mutableMapOf<Int, Int>()
    fun addToSnakeLadderPool() {
        snakeLadderPool[snakeStart] = snakeEnd
        snakeLadderPool[ladderStart] = ladderEnd
    }
}