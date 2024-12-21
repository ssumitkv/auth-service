package com.user.auth.service

import org.springframework.stereotype.Service
import java.util.concurrent.ConcurrentHashMap

@Service
class OtpService {

    private val otpStore = ConcurrentHashMap<String, Int>()

    fun generateOtp(mobile: String) : Int {
        val otp = (1000..9999).random()
        otpStore[mobile] = otp
        return otp
    }

    fun validateOtp(mobile: String, otp: Int): Boolean {
        val storedOtp = otpStore[mobile] ?: return false
        return if(storedOtp == otp) {
            otpStore.remove(mobile)
            true
        } else{
            false
        }
    }

}