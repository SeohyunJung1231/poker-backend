package com.jeong.poker.entity

import com.jeong.poker.domain.Rank
import com.jeong.poker.domain.Suit
import jakarta.persistence.*

@Entity
class Card(
    @Id
    val id: Long,
    @Enumerated(jakarta.persistence.EnumType.STRING)
    val suit: Suit,
    @Enumerated(jakarta.persistence.EnumType.STRING)
    @Column(name = "card_rank")
    val rank: Rank
)