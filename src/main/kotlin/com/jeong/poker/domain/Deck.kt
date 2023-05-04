package com.jeong.poker.domain

import java.util.*

class Deck {
    private val cards = LinkedList<Card>()
    init {
        for (suit in Suit.values()) {
            for (rank in Rank.values()) {
                this.cards.add(Card(suit, rank))
            }
        }
        this.cards.shuffle()
    }

    fun dealCards(number: Int): List<Card> {
        cards.shuffle()
        return cards.take(number)
    }

    fun removeCards(target: Set<Card>) : List<Card> {
        cards.removeAll(target.toSet())
        return cards
    }

    data class Card(
        val suit: Suit, val rank: Rank
    )
}