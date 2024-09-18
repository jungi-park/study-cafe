package com.example.studycafe.kafka

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.test.context.TestConstructor
import kotlin.test.Test

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class kafkaTest(
    private val kafkaTemplate: KafkaTemplate<String, String>
) {

    @Test
    fun `카프카 데이터 전송 테스트`() {
        val message = "데이터 전송 테스트중 1"
        kafkaTemplate.send("my-topic", message)
    }
}