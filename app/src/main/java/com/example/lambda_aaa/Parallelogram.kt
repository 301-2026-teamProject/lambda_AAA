package com.example.lambda_aaa

class Parallelogram(x: Int, y: Int): Shape(x, y) {
    private val area: Int = x * y

    fun getInt() : Int {
        return area
    }
}