package com.example.multivista

class Dice(val numSlides:Int) {
    fun roll():Int{
        return (1..numSlides).random()
    }
}