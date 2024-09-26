package com.example.studycafe.education.repository.custom

import com.querydsl.jpa.impl.JPAQueryFactory
import com.example.studycafe.education.domain.QEducation.education

class EducationCustomRepositoryImpl(
    private val queryFactory : JPAQueryFactory
) : EducationCustomRepository {
    override fun count(): Long {
        return queryFactory
            .select(education.count())
            .from(education)
            .fetchOne() ?:0L
    }
}