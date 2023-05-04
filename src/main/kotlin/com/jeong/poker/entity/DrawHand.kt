package com.jeong.poker.entity

import jakarta.persistence.*

@Entity
class DrawHand (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,
    val gameSessionId: Long,

    @ManyToOne
    @JoinColumn(name = "card_id")
    val card: Card
)