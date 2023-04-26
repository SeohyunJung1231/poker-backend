package com.jeong.poker.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class GameSession(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
    val playerId: Long = 0L,
    val betAmount: Byte,
    val winAmount: Long,
    val startedAt: LocalDateTime = LocalDateTime.now(),
    val endedAt: LocalDateTime?
)