package com.lee989898.flagsquizapp

data class Question(
    val id: Int,
    val questions: String,
    val image: Int,
    val optionOne: String,
    val optionSecond: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
    )
