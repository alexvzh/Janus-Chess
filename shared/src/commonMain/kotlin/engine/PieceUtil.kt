package engine

fun pieceType(piece: Int) = piece and 0b111

fun pieceIsWhite(piece: Int) = piece and Piece.WHITE != 0

fun pieceIsBlack(piece: Int) = piece and Piece.BLACK != 0
