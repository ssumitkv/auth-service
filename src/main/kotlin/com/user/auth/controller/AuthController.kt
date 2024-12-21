package com.user.auth.controller

import com.user.auth.security.JwtTokenProvider
import com.user.auth.service.OtpService
import com.user.auth.service.UserService
import org.apache.coyote.Response
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/auth")
class AuthController (
    private val userService: UserService,
    private val otpService: OtpService,
    private val jwtTokenProvider: JwtTokenProvider
) {

    @PostMapping("/login")
    fun login(@RequestParam(required = false) userName: String?, @RequestParam(required = false) mobile: String?, @RequestParam(required = false) password: String?, @RequestParam otp: Int?) : ResponseEntity<String> {
        val user = userService.getUserByUsernameOrPhone(userName, mobile)
        if(user == null) {
            return ResponseEntity.badRequest().body("No User found!!!")
        }

//        handle password
        if (password != null) {
            if(!userService.validatePassword(user.password, password)) {
                return ResponseEntity.badRequest().body("Invalid credentials.")
            }
        }

//        handle otp

        if(otp != null && !otpService.validateOtp(mobile!!, otp)) {
            return ResponseEntity.badRequest().body("invalid otp !!")
        }

//        var token = jwtTokenProvider.generateJWTToken(user.username, user.userRoles)

//        print("Token: $token")
        return ResponseEntity.badRequest().body("Something went wrong!!")
    }

}