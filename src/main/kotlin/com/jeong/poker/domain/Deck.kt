package com.jeong.poker.domain

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component
import java.util.*

@Component
class Deck { // 새로운 자료구조
    val cards = LinkedList<Card>()

    @PostConstruct
    fun init() {
        for (suit in Suit.values()) {
            for (rank in Rank.values()) {
                this.cards.add(Card(suit, rank))
            }
        }
        this.cards.shuffle()
    }

    fun dealCards(): Card = cards.remove()

    data class Card(
        val suit: Suit, val rank: Rank
    )
}