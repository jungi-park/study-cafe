package com.example.studycafe.education.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaConsumer {

    var receivedMessage = ""

    @KafkaListener(topics = ["my-topic"], groupId = "parkJunGi")
    fun listen(message: String) {
        receivedMessage = message
        println("Received message: $message")
    }
}