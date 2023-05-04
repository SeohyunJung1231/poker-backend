package com.jeong.poker.controller.model

import com.jeong.poker.domain.Deck

data class DrawRequest(
    val heldCards: Set<Deck.Card>,
    val discardedCards: Set<Deck.Card>
)