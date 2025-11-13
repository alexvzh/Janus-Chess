package engine

object Piece {
    const val NONE = 0

    const val KING = 1
    const val PAWN = 2
    const val KNIGHT = 3
    const val BISHOP = 4
    const val ROOK = 5
    const val QUEEN = 6

    const val WHITE = 8
    const val BLACK = 16
}

fun pieceType(piece: Int) = piece and 0b111

fun pieceColor(piece: Int) =
    when {
        isWhite(piece) -> Piece.WHITE
        isBlack(piece) -> Piece.BLACK
        else -> Piece.NONE
    }

fun isWhite(piece: Int) = (piece and Piece.WHITE) != 0

fun isBlack(piece: Int) = (piece and Piece.BLACK) != 0
