package com.user.auth.entity;

import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.ManyToMany
import jakarta.persistence.OneToMany

@Entity(name = "user")
data class UserEntity (

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val username: String,
    val password: String,
    val email: String,
    val mobile: String,
    var googleAuthSecret: String? = null,
    var is2FAEnabled: Boolean = false,

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    val userRoles: Set<UserRole> = setOf()
)
