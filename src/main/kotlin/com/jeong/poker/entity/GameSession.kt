package com.jeong.poker.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import java.time.LocalDateTime
import java.util.UUID

@Entity
class GameSession(
    @Id
    val id: String = UUID.randomUUID().toString(),
    val playerId: Long = 0L,
    val betAmount: Byte,
    val winAmount: Long? = null,
    val startedAt: LocalDateTime = LocalDateTime.now(),
    val endedAt: LocalDateTime? = null,
)