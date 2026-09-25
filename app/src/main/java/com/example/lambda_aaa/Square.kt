package com.example.lambda_aaa

class Square(x: Int, y: Int): Shape(x, y) {
    private val area: Int = x * y
    private val color: String = "emerald"

    fun getArea(): Int {
        return area
    }
}