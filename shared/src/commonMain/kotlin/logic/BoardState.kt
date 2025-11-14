package logic

import engine.Piece

class BoardState(
    val squares: IntArray = IntArray(64),
    var sideToMove: Int = Piece.WHITE,
    var castlingRights: Int = 0,
    var enPassantSquare: Int = -1,
    var halfmoveClock: Int = 0,
    var fullmoveNumber: Int = 1,
) {
    fun index(
        file: Int,
        rank: Int,
    ) = rank * 8 + file

    fun get(
        file: Int,
        rank: Int,
    ): Int = squares[index(file, rank)]

    operator fun get(square: Int): Int = squares[square]

    operator fun set(
        square: Int,
        piece: Int,
    ) {
        squares[square] = piece
    }
}
