package logic

import engine.Piece

object Fen {
    fun load(fen: String): BoardState {
        val state = BoardState()
        val squares = state.squares

        val parts = fen.split(" ")
        val boardPart = parts[0]

        var rank = 7
        var file = 0

        val pieceFromSymbol =
            mapOf(
                'k' to Piece.KING,
                'p' to Piece.PAWN,
                'n' to Piece.KNIGHT,
                'b' to Piece.BISHOP,
                'r' to Piece.ROOK,
                'q' to Piece.QUEEN,
            )

        for (c in boardPart) {
            when {
                c == '/' -> {
                    rank--
                    file = 0
                }
                c.isDigit() -> {
                    file += c.digitToInt()
                }
                else -> {
                    val color = if (c.isUpperCase()) Piece.WHITE else Piece.BLACK
                    val type = pieceFromSymbol[c.lowercaseChar()]!!
                    squares[rank * 8 + file] = color or type
                    file++
                }
            }
        }

        state.sideToMove = if (parts[1] == "w") Piece.WHITE else Piece.BLACK

        return state
    }
}
