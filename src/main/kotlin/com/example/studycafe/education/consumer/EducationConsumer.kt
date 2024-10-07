package com.example.studycafe.education.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class EducationConsumer {

    @KafkaListener(topics = ["my-topic"], groupId = "parkJunGi")
    fun listenEducationQueue(message: String) {
        val receivedMessage = message
    }
}