package integrationtest.repository

import com.jeong.poker.PokerApplication
import com.jeong.poker.entity.GameSession
import com.jeong.poker.repository.GameSessionRepository
import io.kotest.matchers.nulls.shouldNotBeNull
import jakarta.transaction.Transactional
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [PokerApplication::class])
@Transactional
class GameSessionRepositoryTest{
    @Autowired
    private lateinit var gameSessionRepository: GameSessionRepository

    @Test
    fun `gameSession 이 제대로 저장되는지 확인한다`() {
        // given
        val gameSession = GameSession(betAmount = 10)

        // when
        gameSessionRepository.save(gameSession)

        // then
        gameSessionRepository.findById(gameSession.id).shouldNotBeNull()
    }
}