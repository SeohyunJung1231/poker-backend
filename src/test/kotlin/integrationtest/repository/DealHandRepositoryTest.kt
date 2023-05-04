package integrationtest.repository

import com.jeong.poker.PokerApplication
import com.jeong.poker.entity.DealHand
import com.jeong.poker.repository.DealHandRepository
import io.kotest.matchers.nulls.shouldNotBeNull
import jakarta.transaction.Transactional
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.util.UUID

@SpringBootTest(classes = [PokerApplication::class])
@Transactional
class DealHandRepositoryTest {
    @Autowired
    private lateinit var dealHandRepository: DealHandRepository

    @Test
    fun `dealHand 가 제대로 저장되는지 확인`() {
        // given
        val dealHand = DealHand(
            gameSessionId = UUID.randomUUID().toString(),
            cardId = 10
        )

        // when
        val entity = dealHandRepository.save(dealHand)

        // then
        dealHandRepository.findById(entity.id).shouldNotBeNull()
    }
}