package com.jeong.poker.entity

import jakarta.persistence.*

@Entity
class Player(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,
    val username: String,
    val password: String
)
