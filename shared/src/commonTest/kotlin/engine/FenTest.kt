package engine

import logic.Fen
import kotlin.test.Test
import kotlin.test.assertEquals

class FenTest {
    @Test
    fun loadStartingPosition() {
        val state = Fen.load("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w")

        assertEquals(Piece.ROOK or Piece.WHITE, state.squares[0]) // a1 = index 0
        assertEquals(Piece.KING or Piece.BLACK, state.squares[60]) // e8 = index 60
    }
}
