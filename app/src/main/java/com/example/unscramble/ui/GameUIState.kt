package com.example.unscramble.ui

data class GameUIState(
    val currentScrambledWord: String = "",
    val isGuessedWrong: Boolean = false,
    val currentWordCount: Int = 1,
    val score: Int = 0,
    val isGameOver: Boolean = false
)
