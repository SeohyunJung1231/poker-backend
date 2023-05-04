package com.jeong.poker.service

import com.jeong.poker.domain.Deck
import org.springframework.stereotype.Service

@Service
class DealerService {
    fun dealCards(): Set<Deck.Card> {
        val deck = Deck()
        return deck.dealCards(5).toSet()
    }

    fun drawCards(except: Set<Deck.Card>, number: Int): Set<Deck.Card> {
        val deck = Deck()

        deck.removeCards(except.toSet())
        return deck.dealCards(number).toSet()
    }
}