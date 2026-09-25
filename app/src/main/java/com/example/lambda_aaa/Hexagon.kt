package com.example.lambda_aaa
import kotlin.math.roundToInt

class Hexagon(x: Int, y: Int): Shape(x, y) {
    private val area: Int = (0.75 * x * y).roundToInt()

    fun getInt() : Int {
        return area
    }
}