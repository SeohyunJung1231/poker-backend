package com.jeong.poker.controller.model

import java.time.LocalDateTime

data class DealRequest (
    val playerId: Long,
    val betAmount: Byte,
    val startedAt: LocalDateTime = LocalDateTime.now()
)