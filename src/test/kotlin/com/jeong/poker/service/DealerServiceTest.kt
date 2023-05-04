package com.jeong.poker.service

import com.jeong.poker.domain.Deck
import com.jeong.poker.domain.Rank
import com.jeong.poker.domain.Suit
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class DealerServiceTest : BehaviorSpec({
    val dealerService = DealerService()

    given("딜러에게 게임 시작을 위한 카드 5장 요청") {
        `when`("딜러가 카드 다섯장을 줄 때마다") {
            val cards = dealerService.dealCards()
            then("5장이어야 한다") {
                cards.size shouldBe 5
            }
            then("랜덤한 카드여야 한다") {
                val otherCards = dealerService.dealCards()
                cards shouldNotBe otherCards
            }
        }
    }
    given("딜러에게 게임 중간에 draw 요청") {
        val except = setOf(
            Deck.Card(suit = Suit.HEARTS, rank = Rank.FIVE),
            Deck.Card(suit = Suit.HEARTS, rank = Rank.ACE),
            Deck.Card(suit = Suit.DIAMONDS, rank = Rank.SIX),
            Deck.Card(suit = Suit.DIAMONDS, rank = Rank.SEVEN),
            Deck.Card(suit = Suit.CLUBS, rank = Rank.QUEEN)
        )
        val number = 3
        `when`("딜러가 draw 요청을 줄 떄마다") {
            val cards = dealerService.drawCards(except, number)
            then("요청한 개수만큼 카드를 준다") {
                cards.size shouldBe number
            }
            then("제외 요청한 카드는 없이 준다") {
                cards.intersect(except) shouldBe setOf()
            }
        }
    }
})
