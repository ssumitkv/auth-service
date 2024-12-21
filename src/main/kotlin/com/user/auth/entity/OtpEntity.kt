package com.user.auth.entity

import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

@Entity(name = "otp")
data class OtpEntity (

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val test: String
)
