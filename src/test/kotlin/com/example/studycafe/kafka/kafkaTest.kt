package com.example.studycafe.kafka

import com.example.studycafe.education.consumer.KafkaConsumer
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.test.context.TestConstructor
import kotlin.test.Test

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class kafkaTest(
    private val kafkaTemplate: KafkaTemplate<String, String>,
    private val kafkaConsumer: KafkaConsumer
) {

    @Test
    fun `카프카 데이터 전송 테스트`() {
        val message = "데이터 전송 테스트중 1"
        kafkaTemplate.send("my-topic", message)
    }

    @Test
    fun listen() {
        kafkaTemplate.send("my-topic", "테스트 메시지")

        // 메시지가 수신될 때까지 대기
        Thread.sleep(1000)

        println("kafkaConsumer == ${kafkaConsumer.receivedMessage}")
    }
}