package com.user.auth.security;

import com.auth0.jwt.algorithms.Algorithm
import com.auth0.jwt.interfaces.JWTVerifier
import java.security.SecureRandom
import java.util.Date

class JwtTokenProvider {
    private var algorithm: Algorithm = Algorithm.HMAC256("MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBALC1xrs86Tk3UXUzXLX1CXgEjik8j8S2IDPWKkLsEFkBeQBFinTV8WgoTn6dQeXSHP3UYqwap1mAEMILYllL1tGtpxN6")
    private lateinit var verifier: JWTVerifier

//    private val secretKey = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBALC1xrs86Tk3UXUzXLX1CXgEjik8j8S2IDPWKkLsEFkBeQBFinTV8WgoTn6dQeXSHP3UYqwap1mAEMILYllL1tGtpxN6+c7BbN2nfw0rg77NYyfcI9KND6fWkR4lnbo/aCag4VQ7UW58RcLfSDyxjNuwYhllj0EuL60GHghOKMdtAgMBAAECgYBFNl1pVtkuXNld40krx5b22CnqQts4u/Du/LI+1gEtK2N+VL5/NpDAMBFWjDeUUXCjhr1DFYl4h62IozbZLNgtT4o90/Yo4IC1uzOXPTLmgSWPIyHCiK4Ouow4jVSykyDzt3/R2wk6/JqisPoJl/OhBnHYoWovqkF8UU/fjwxrIQJBANfPEwe/NBIJ8e7J7zESvYe+9kAOe2+cDFBv+H5VWrdlfIiBirN+NeTToRTEqDM7NpdPl2gMjtYxg/1p3BOGUGUCQQDRnp9ra4tABU0ADU4Uq1nF5SLK8CdjqA1UxeRdKPVy7pSCRfu07sGxltH1ykD9FcQ7uF62dr+A+xfDOBvDorZpAkA7p54XEh+OrPkXjPJ1mjyR/ZOMeXRdkcFFqu4B3g5Ji+A0y7pPi5/SNT3dw87K+p9IjFPKC06gnudhcZXIP+SRAkA7ND/2iQNla5nZ3+gjslnCqPrwsm+NmBNb1CCxpzXb5kKPoNB8w8p1LBHVB/DfClzIOUSW6GciOMj3XEuLL9OxAkBhokbbi/QLmRHB8tST5w88MXr8vJ+OG7e2q0+1H36Ak4UdrmNZ0k2S90O2P8LgAPgJaNeQKET14spnPHwku5yC"
//    private val validityInMilliseconds = 3600000

    private val secureKey: ByteArray
        get() {
            val key = ByteArray(32) // 32 bytes for HS256
            SecureRandom().nextBytes(key)
            return key
        }
//    private val secretKey = Keys.hmacShaKeyFor(secureKey)
//    private val validityInMilliseconds = 3600000 // 1 hour
//
//    fun createToken(username: String, roles: List<String>): String {
//        val claims: MutableMap<String, Any> = mutableMapOf("sub" to username)
//        claims["roles"] = roles
//
//        val now = Date()
//        val validity = Date(now.time + validityInMilliseconds)
//
//        return Jwts.builder()
//            .setClaims(claims)
//            .setIssuedAt(now)
//            .setExpiration(validity)
//            .signWith(secretKey)
//            .compact()
//    }
//
//    fun validateToken(token: String): Boolean {
//        try {
//            Jwts.parserBuilder().setSigningKey(secretKey).build().parseClaimsJws(token)
//            return true
//        } catch (e: Exception) {
//            return false
//        }
//    }
//
//    fun getUsername(token: String): String {
//        return Jwts.parserBuilder().setSigningKey(secretKey).build()
//            .parseClaimsJws(token)
//            .body
//            .subject
//    }
}

