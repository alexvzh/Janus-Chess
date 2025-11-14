package me.alex.janus.chess

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import compose.ChessBoard

@Suppress("ktlint:standard:function-naming")
@Composable
fun App() {
    val boardSize = 800.dp
    ChessBoard(boardSize)
}
