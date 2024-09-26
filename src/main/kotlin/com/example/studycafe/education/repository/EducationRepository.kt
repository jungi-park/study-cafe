package com.example.studycafe.education.repository

import com.example.studycafe.education.domain.Education
import com.example.studycafe.education.repository.custom.EducationCustomRepository
import org.springframework.data.jpa.repository.JpaRepository

interface EducationRepository : JpaRepository<Education,Long>, EducationCustomRepository {
}