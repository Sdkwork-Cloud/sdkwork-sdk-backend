package com.sdkwork.backend

data class LoginForm(
    val type: String? = null,
    val email: String? = null,
    val phone: String? = null,
    val username: String? = null,
    val password: String? = null,
    val owner: String? = null,
    val captcha: String? = null,
    val captchaId: String? = null,
    val rememberMe: Boolean? = null,
    val verificationCode: String? = null,
    val invitationCode: String? = null
)
