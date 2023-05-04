package com.jeong.poker.controller.model

import com.jeong.poker.domain.Deck

data class GameStartInfo(
    private val cards: Set<Deck.Card>,
    private val sessionId: String
)