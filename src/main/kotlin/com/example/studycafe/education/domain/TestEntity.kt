package com.example.studycafe.education.domain

import jakarta.persistence.*

@Entity
@Table(name = "test_entity")
class TestEntity (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "entity_id") val entityId : Long
)