package com.user.auth.service

import com.user.auth.entity.UserEntity
import com.user.auth.repository.UserRepository

class UserService (
    private val userRepository: UserRepository
) {
    fun getUserByUsernameOrPhone(username:  String?, mobile: String?): UserEntity? {
        return userRepository.findByUsernameOrMobile(username, mobile)
    }

    fun validatePassword(username: kotlin.String, password: kotlin.String): Boolean {
//    TODO: implement bcrypt
        return true

    }
}