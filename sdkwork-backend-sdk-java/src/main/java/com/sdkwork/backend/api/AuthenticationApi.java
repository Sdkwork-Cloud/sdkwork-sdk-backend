package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AuthenticationApi {
    private final HttpClient client;
    
    public AuthenticationApi(HttpClient client) {
        this.client = client;
    }

    /** 重置密码 */
    public PlusApiResultPasswordResetResultVO resetPassword(PasswordResetForm body) throws Exception {
        return (PlusApiResultPasswordResetResultVO) client.post(ApiPaths.backendPath("/auth/authentication/reset_password"), body);
    }

    /** 请求密码重置 */
    public PlusApiResultPasswordResetResultVO requestPasswordReset(PasswordResetRequestForm body) throws Exception {
        return (PlusApiResultPasswordResetResultVO) client.post(ApiPaths.backendPath("/auth/authentication/request_password_reset"), body);
    }

    /** 用户注册 */
    public PlusApiResultRegisterResultVO register(RegisterForm body) throws Exception {
        return (PlusApiResultRegisterResultVO) client.post(ApiPaths.backendPath("/auth/authentication/register"), body);
    }

    /** 刷新访问令牌 */
    public PlusApiResultLoginResultVO refreshToken(RefreshTokenForm body) throws Exception {
        return (PlusApiResultLoginResultVO) client.post(ApiPaths.backendPath("/auth/authentication/refresh_token"), body);
    }

    /** 退出登录 */
    public PlusApiResultVoid logout() throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.backendPath("/auth/authentication/logout"), null);
    }

    /** 用户登录 */
    public LoginResultVO login(LoginForm body) throws Exception {
        return (LoginResultVO) client.post(ApiPaths.backendPath("/auth/authentication/login"), body);
    }

    /** 修改密码 */
    public PlusApiResultBoolean changePassword(ChangePasswordForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/auth/authentication/change_password"), body);
    }

    /** 获取当前用户信息 */
    public PlusApiResultUserVO getCurrentUser() throws Exception {
        return (PlusApiResultUserVO) client.get(ApiPaths.backendPath("/auth/authentication/get_current_user"));
    }
}
