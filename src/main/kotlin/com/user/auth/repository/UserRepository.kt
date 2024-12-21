package com.user.auth.repository

import com.user.auth.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<UserEntity, Long> {
    fun findByUsernameOrMobile(username: String?, mobile: String?): UserEntity?
}