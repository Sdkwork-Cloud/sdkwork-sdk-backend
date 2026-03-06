package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AuthApi(private val client: HttpClient) {

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

    /** Generate login QR code */
    suspend fun generateQrCode(): PlusApiResultQrCodeVO? {
        return client.post(ApiPaths.backendPath("/auth/qrcode/generate"), null) as? PlusApiResultQrCodeVO
    }

    /** Confirm QR login */
    suspend fun confirmQrCodeLogin(body: QrCodeConfirmForm): PlusApiResultVoid? {
        return client.post(ApiPaths.backendPath("/auth/qrcode/confirm"), body) as? PlusApiResultVoid
    }

    /** Get OAuth authorization URL */
    suspend fun getAuthUrl(body: OAuthLoginRequestForm): PlusApiResultOAuthLoginResponseVO? {
        return client.post(ApiPaths.backendPath("/auth/oauth/get_auth_url"), body) as? PlusApiResultOAuthLoginResponseVO
    }

    /** Get OAuth authorization URL */
    suspend fun createGetAuthUrl(body: OAuthLoginRequestForm): PlusApiResultOAuthLoginResponseVO? {
        return client.post(ApiPaths.backendPath("/auth/oauth/authorize"), body) as? PlusApiResultOAuthLoginResponseVO
    }

    /** Handle OAuth callback */
    suspend fun handleCallback(body: OAuthCallbackForm): PlusApiResultLoginResultVO? {
        return client.post(ApiPaths.backendPath("/auth/oauth/callback"), body) as? PlusApiResultLoginResultVO
    }

    /** Check role */
    suspend fun hasRole(body: RoleCheckForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/auth/authorization/has_role"), body) as? PlusApiResultBoolean
    }

    /** Check permission */
    suspend fun hasPermission(body: PermissionCheckForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/auth/authorization/has_permission"), body) as? PlusApiResultBoolean
    }

    /** Reset password */
    suspend fun resetPassword(body: PasswordResetForm): PlusApiResultPasswordResetResultVO? {
        return client.post(ApiPaths.backendPath("/auth/authentication/reset_password"), body) as? PlusApiResultPasswordResetResultVO
    }

    /** Request password reset */
    suspend fun requestPasswordReset(body: PasswordResetRequestForm): PlusApiResultPasswordResetResultVO? {
        return client.post(ApiPaths.backendPath("/auth/authentication/request_password_reset"), body) as? PlusApiResultPasswordResetResultVO
    }

    /** Register */
    suspend fun register(body: RegisterForm): PlusApiResultRegisterResultVO? {
        return client.post(ApiPaths.backendPath("/auth/authentication/register"), body) as? PlusApiResultRegisterResultVO
    }

    /** Refresh token */
    suspend fun refreshToken(body: RefreshTokenForm): PlusApiResultLoginResultVO? {
        return client.post(ApiPaths.backendPath("/auth/authentication/refresh_token"), body) as? PlusApiResultLoginResultVO
    }

    /** Logout */
    suspend fun logout(): PlusApiResultVoid? {
        return client.post(ApiPaths.backendPath("/auth/authentication/logout"), null) as? PlusApiResultVoid
    }

    /** Login */
    suspend fun login(body: LoginForm): LoginResultVO? {
        return client.post(ApiPaths.backendPath("/auth/authentication/login"), body) as? LoginResultVO
    }

    /** Change password */
    suspend fun changePassword(body: ChangePasswordForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/auth/authentication/change_password"), body) as? PlusApiResultBoolean
    }

    /** Get current tenant/organization access token */
    suspend fun getCurrentAccessToken(body: GetCurrentAccessTokenForm): PlusApiResultCurrentAccessTokenVO? {
        return client.post(ApiPaths.backendPath("/auth/access_token/current"), body) as? PlusApiResultCurrentAccessTokenVO
    }

    /** Check QR code status */
    suspend fun checkQrCodeStatus(qrKey: String): PlusApiResultQrCodeStatusVO? {
        return client.get(ApiPaths.backendPath("/auth/qrcode/status/$qrKey")) as? PlusApiResultQrCodeStatusVO
    }

    /** Get roles */
    suspend fun getRoles(): PlusApiResultListString? {
        return client.get(ApiPaths.backendPath("/auth/authorization/roles")) as? PlusApiResultListString
    }

    /** Get permissions */
    suspend fun getPermissions(): PlusApiResultListString? {
        return client.get(ApiPaths.backendPath("/auth/authorization/permissions")) as? PlusApiResultListString
    }

    /** Get current user */
    suspend fun getCurrentUser(): PlusApiResultUserVO? {
        return client.get(ApiPaths.backendPath("/auth/authentication/get_current_user")) as? PlusApiResultUserVO
    }
}
