package components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Suppress("ktlint:standard:function-naming")
@Composable
fun ChessBoard(size: Dp) {
    BoxWithConstraints {
        Column(Modifier.size(size)) {
            for (rank in 7 downTo 0) {
                Row(Modifier.weight(1f)) {
                    for (file in 0 until 8) {
                        val isLight = (rank + file) % 2 == 0
                        val color = if (isLight) Color(46, 17, 184) else Color(24, 15, 66)

                        Box(
                            modifier =
                                Modifier
                                    .weight(1f)
                                    .fillMaxSize()
                                    .background(color),
                        )
                    }
                }
            }
        }
    }
}
