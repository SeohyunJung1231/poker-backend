package com.jeong.poker.controller

import com.jeong.poker.controller.model.DealRequest
import com.jeong.poker.controller.model.DrawRequest
import com.jeong.poker.controller.model.GameStartInfo
import com.jeong.poker.domain.Deck
import com.jeong.poker.entity.DealHand
import com.jeong.poker.entity.GameSession
import com.jeong.poker.repository.CardRepository
import com.jeong.poker.repository.DealHandRepository
import com.jeong.poker.repository.GameSessionRepository
import com.jeong.poker.service.CardCacheService
import com.jeong.poker.service.DealerService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class PlayController(
    private val dealerService: DealerService,
    private val gameSessionRepository: GameSessionRepository,
    private val dealHandRepository: DealHandRepository,
    private val cardRepository: CardRepository
) {

    @PostMapping("/games")
    fun startGame(@RequestBody request: DealRequest): GameStartInfo {
        // 1. 세션을 가져온다.
        val sessionId = UUID.randomUUID().toString()

        // 2. 카드 5장 선별한다.
        val dealCards = dealerService.dealCards()

        // 3. DB에 정보 저장한다. (선별된 카드, 세션 정보)
        val allCards = cardRepository.findAll()
        dealHandRepository.saveAll(
            dealCards.map { card ->
                DealHand(
                    gameSessionId = sessionId,
                    cardId = allCards.first {
                        (it.suit == card.suit) && (it.rank == card.rank)
                    }.id
                )
            }
        )
        gameSessionRepository.save(
            GameSession(
                id = sessionId,
                playerId = request.playerId,
                betAmount = request.betAmount
            )
        )

        return GameStartInfo(
            cards = dealCards, sessionId = sessionId
        )
    }

    @PutMapping("/games/{sessionId}")
    fun draw(@PathVariable sessionId: String, @RequestBody drawRequest: DrawRequest): Set<Deck.Card> {
        require(exist(sessionId))

        // 1. draw 카드 제공
        val newCards = dealerService.drawCards(
            drawRequest.heldCards + drawRequest.discardedCards, drawRequest.discardedCards.size
        )

        // 2. DB에 값을 저장한다.


        return newCards
    }

    private fun exist(sessionId: String) = !gameSessionRepository.findById(sessionId).isEmpty
}