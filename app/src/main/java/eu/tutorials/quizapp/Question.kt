package eu.tutorials.quizapp

import androidx.annotation.DrawableRes

data class Question(
    val id:Int,
    val question:String,
    @DrawableRes
    val image:Int,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour:String,
    val correctAnswer:Int
)
