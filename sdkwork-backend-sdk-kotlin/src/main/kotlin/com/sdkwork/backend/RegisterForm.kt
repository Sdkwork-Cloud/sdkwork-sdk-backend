package com.sdkwork.backend

data class RegisterForm(
    val username: String? = null,
    val password: String? = null,
    val confirmPassword: String? = null,
    val email: String? = null,
    val phone: String? = null,
    val captcha: String? = null,
    val captchaId: String? = null,
    val type: String? = null,
    val verificationCode: String? = null,
    val invitationCode: String? = null
)
