package game

import model.Board
import model.Square

/**
 * For running the othelo game.
 *
 * Currently only used for testing
 */
fun main(args : Array<String>) {
    val testSquare : Square = Square.EMPTY
    val test2 = Square.WHITE

    println("testSquare = ${testSquare.name} (${testSquare.ordinal})")
    println("test2 = ${test2.name} (${test2.ordinal})")

    val board1 = Board(1)
    val board2 = Board()

    println("Board1 size = ${board1.boardSize}")
    println("Board2 size = ${board2.boardSize}")
}