package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VerificationApi(private val client: HttpClient) {

    /** Verify phone */
    suspend fun verifyPhone(body: PhoneVerificationForm): PlusApiResultVerificationVO? {
        return client.post(ApiPaths.backendPath("/auth/verification/verify_phone"), body) as? PlusApiResultVerificationVO
    }

    /** Verify email */
    suspend fun verifyEmail(body: EmailVerificationForm): PlusApiResultVerificationVO? {
        return client.post(ApiPaths.backendPath("/auth/verification/verify_email"), body) as? PlusApiResultVerificationVO
    }

    /** Send verification code */
    suspend fun sendVerificationCode(body: SendVerificationCodeForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/auth/verification/send_code"), body) as? PlusApiResultBoolean
    }
}
