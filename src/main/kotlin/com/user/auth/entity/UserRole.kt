package com.user.auth.entity

import jakarta.persistence.Column
import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity(name = "user_role")
data class UserRole (
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,

    @ManyToOne
    @JoinColumn(name = "user_id", nullable= false)
    val user: UserEntity
)
