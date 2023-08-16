package com.example.paparazziexample

import androidx.compose.material3.Text
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.jupiter.api.Test

class PaparazziTests{
    @get:Rule
    val paparazzi: Paparazzi = Paparazzi()

    @Test
    fun inputFieldSnapshot() {
        paparazzi.snapshot {
            Text(text = "test")
//            InputField("TEST", {})
        }
    }
}