package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AuthApi {
    private final HttpClient client;
    
    public AuthApi(HttpClient client) {
        this.client = client;
    }

    /** Verify phone */
    public PlusApiResultVerificationVO verifyPhone(PhoneVerificationForm body) throws Exception {
        return (PlusApiResultVerificationVO) client.post(ApiPaths.backendPath("/auth/verification/verify_phone"), body);
    }

    /** Verify email */
    public PlusApiResultVerificationVO verifyEmail(EmailVerificationForm body) throws Exception {
        return (PlusApiResultVerificationVO) client.post(ApiPaths.backendPath("/auth/verification/verify_email"), body);
    }

    /** Send verification code */
    public PlusApiResultBoolean sendVerificationCode(SendVerificationCodeForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/auth/verification/send_code"), body);
    }

    /** Generate login QR code */
    public PlusApiResultQrCodeVO generateQrCode() throws Exception {
        return (PlusApiResultQrCodeVO) client.post(ApiPaths.backendPath("/auth/qrcode/generate"), null);
    }

    /** Confirm QR login */
    public PlusApiResultVoid confirmQrCodeLogin(QrCodeConfirmForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.backendPath("/auth/qrcode/confirm"), body);
    }

    /** Get OAuth authorization URL */
    public PlusApiResultOAuthLoginResponseVO getAuthUrl(OAuthLoginRequestForm body) throws Exception {
        return (PlusApiResultOAuthLoginResponseVO) client.post(ApiPaths.backendPath("/auth/oauth/get_auth_url"), body);
    }

    /** Get OAuth authorization URL */
    public PlusApiResultOAuthLoginResponseVO createGetAuthUrl(OAuthLoginRequestForm body) throws Exception {
        return (PlusApiResultOAuthLoginResponseVO) client.post(ApiPaths.backendPath("/auth/oauth/authorize"), body);
    }

    /** Handle OAuth callback */
    public PlusApiResultLoginResultVO handleCallback(OAuthCallbackForm body) throws Exception {
        return (PlusApiResultLoginResultVO) client.post(ApiPaths.backendPath("/auth/oauth/callback"), body);
    }

    /** Check role */
    public PlusApiResultBoolean hasRole(RoleCheckForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/auth/authorization/has_role"), body);
    }

    /** Check permission */
    public PlusApiResultBoolean hasPermission(PermissionCheckForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/auth/authorization/has_permission"), body);
    }

    /** Reset password */
    public PlusApiResultPasswordResetResultVO resetPassword(PasswordResetForm body) throws Exception {
        return (PlusApiResultPasswordResetResultVO) client.post(ApiPaths.backendPath("/auth/authentication/reset_password"), body);
    }

    /** Request password reset */
    public PlusApiResultPasswordResetResultVO requestPasswordReset(PasswordResetRequestForm body) throws Exception {
        return (PlusApiResultPasswordResetResultVO) client.post(ApiPaths.backendPath("/auth/authentication/request_password_reset"), body);
    }

    /** Register */
    public PlusApiResultRegisterResultVO register(RegisterForm body) throws Exception {
        return (PlusApiResultRegisterResultVO) client.post(ApiPaths.backendPath("/auth/authentication/register"), body);
    }

    /** Refresh token */
    public PlusApiResultLoginResultVO refreshToken(RefreshTokenForm body) throws Exception {
        return (PlusApiResultLoginResultVO) client.post(ApiPaths.backendPath("/auth/authentication/refresh_token"), body);
    }

    /** Logout */
    public PlusApiResultVoid logout() throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.backendPath("/auth/authentication/logout"), null);
    }

    /** Login */
    public LoginResultVO login(LoginForm body) throws Exception {
        return (LoginResultVO) client.post(ApiPaths.backendPath("/auth/authentication/login"), body);
    }

    /** Change password */
    public PlusApiResultBoolean changePassword(ChangePasswordForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/auth/authentication/change_password"), body);
    }

    /** Get current tenant/organization access token */
    public PlusApiResultCurrentAccessTokenVO getCurrentAccessToken(GetCurrentAccessTokenForm body) throws Exception {
        return (PlusApiResultCurrentAccessTokenVO) client.post(ApiPaths.backendPath("/auth/access_token/current"), body);
    }

    /** Check QR code status */
    public PlusApiResultQrCodeStatusVO checkQrCodeStatus(String qrKey) throws Exception {
        return (PlusApiResultQrCodeStatusVO) client.get(ApiPaths.backendPath("/auth/qrcode/status/" + qrKey + ""));
    }

    /** Get roles */
    public PlusApiResultListString getRoles() throws Exception {
        return (PlusApiResultListString) client.get(ApiPaths.backendPath("/auth/authorization/roles"));
    }

    /** Get permissions */
    public PlusApiResultListString getPermissions() throws Exception {
        return (PlusApiResultListString) client.get(ApiPaths.backendPath("/auth/authorization/permissions"));
    }

    /** Get current user */
    public PlusApiResultUserVO getCurrentUser() throws Exception {
        return (PlusApiResultUserVO) client.get(ApiPaths.backendPath("/auth/authentication/get_current_user"));
    }
}
