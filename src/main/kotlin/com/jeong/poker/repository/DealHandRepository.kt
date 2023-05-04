package com.jeong.poker.repository

import com.jeong.poker.entity.DealHand
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DealHandRepository: JpaRepository<DealHand, Long>