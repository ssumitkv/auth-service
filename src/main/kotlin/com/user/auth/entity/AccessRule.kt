package com.user.auth.entity

import com.user.auth.enums.Role
import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

@Entity(name = "access_rule")
data class AccessRule (

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val urlPattern: String,
    @Enumerated(EnumType.STRING)
    val role: Role
)