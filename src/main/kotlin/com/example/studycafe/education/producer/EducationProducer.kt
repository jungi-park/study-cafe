package com.example.studycafe.education.producer

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class EducationProducer(
    private val kafkaTemplate: KafkaTemplate<String, String>,
) {
    fun sendEducationQueue( message: String) {
        kafkaTemplate.send("my-topic", message)
    }
}