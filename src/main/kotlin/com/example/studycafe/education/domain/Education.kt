package com.example.studycafe.education.domain

import jakarta.persistence.*

@Entity
@Table(name = "education")
class Education(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "education_id") val educationId: Long,
)