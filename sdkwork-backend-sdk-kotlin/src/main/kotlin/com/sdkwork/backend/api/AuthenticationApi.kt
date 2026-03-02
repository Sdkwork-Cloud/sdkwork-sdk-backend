package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AuthenticationApi(private val client: HttpClient) {

    /** 重置密码 */
    suspend fun resetPassword(body: PasswordResetForm): PlusApiResultPasswordResetResultVO? {
        return client.post(ApiPaths.backendPath("/auth/authentication/reset_password"), body) as? PlusApiResultPasswordResetResultVO
    }

    /** 请求密码重置 */
    suspend fun requestPasswordReset(body: PasswordResetRequestForm): PlusApiResultPasswordResetResultVO? {
        return client.post(ApiPaths.backendPath("/auth/authentication/request_password_reset"), body) as? PlusApiResultPasswordResetResultVO
    }

    /** 用户注册 */
    suspend fun register(body: RegisterForm): PlusApiResultRegisterResultVO? {
        return client.post(ApiPaths.backendPath("/auth/authentication/register"), body) as? PlusApiResultRegisterResultVO
    }

    /** 刷新访问令牌 */
    suspend fun refreshToken(body: RefreshTokenForm): PlusApiResultLoginResultVO? {
        return client.post(ApiPaths.backendPath("/auth/authentication/refresh_token"), body) as? PlusApiResultLoginResultVO
    }

    /** 退出登录 */
    suspend fun logout(): PlusApiResultVoid? {
        return client.post(ApiPaths.backendPath("/auth/authentication/logout"), null) as? PlusApiResultVoid
    }

    /** 用户登录 */
    suspend fun login(body: LoginForm): LoginResultVO? {
        return client.post(ApiPaths.backendPath("/auth/authentication/login"), body) as? LoginResultVO
    }

    /** 修改密码 */
    suspend fun changePassword(body: ChangePasswordForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/auth/authentication/change_password"), body) as? PlusApiResultBoolean
    }

    /** 获取当前用户信息 */
    suspend fun getCurrentUser(): PlusApiResultUserVO? {
        return client.get(ApiPaths.backendPath("/auth/authentication/get_current_user")) as? PlusApiResultUserVO
    }
}
