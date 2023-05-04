package com.jeong.poker.service

import com.jeong.poker.entity.Card
import com.jeong.poker.repository.CardRepository
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service

@Service
class CardCacheService(
    private val cardRepository: CardRepository
) {
    var cards: List<Card> = cardRepository.findAll()

    @PostConstruct
    fun refreshCache() {
        cards = cardRepository.findAll()
//        check(cards.size == DECK_SIZE)
    }


    companion object {
        private const val DECK_SIZE = 52
    }
}