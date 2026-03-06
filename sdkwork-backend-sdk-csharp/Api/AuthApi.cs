using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AuthApi
    {
        private readonly HttpClient _client;

        public AuthApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Verify phone
        /// </summary>
        public async Task<PlusApiResultVerificationVO?> VerifyPhoneAsync(PhoneVerificationForm body)
        {
            return await _client.PostAsync<PlusApiResultVerificationVO>(ApiPaths.BackendPath("/auth/verification/verify_phone"), body);
        }

        /// <summary>
        /// Verify email
        /// </summary>
        public async Task<PlusApiResultVerificationVO?> VerifyEmailAsync(EmailVerificationForm body)
        {
            return await _client.PostAsync<PlusApiResultVerificationVO>(ApiPaths.BackendPath("/auth/verification/verify_email"), body);
        }

        /// <summary>
        /// Send verification code
        /// </summary>
        public async Task<PlusApiResultBoolean?> SendVerificationCodeAsync(SendVerificationCodeForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/auth/verification/send_code"), body);
        }

        /// <summary>
        /// Generate login QR code
        /// </summary>
        public async Task<PlusApiResultQrCodeVO?> GenerateQrCodeAsync()
        {
            return await _client.PostAsync<PlusApiResultQrCodeVO>(ApiPaths.BackendPath("/auth/qrcode/generate"), null);
        }

        /// <summary>
        /// Confirm QR login
        /// </summary>
        public async Task<PlusApiResultVoid?> ConfirmQrCodeLoginAsync(QrCodeConfirmForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.BackendPath("/auth/qrcode/confirm"), body);
        }

        /// <summary>
        /// Get OAuth authorization URL
        /// </summary>
        public async Task<PlusApiResultOAuthLoginResponseVO?> GetAuthUrlAsync(OAuthLoginRequestForm body)
        {
            return await _client.PostAsync<PlusApiResultOAuthLoginResponseVO>(ApiPaths.BackendPath("/auth/oauth/get_auth_url"), body);
        }

        /// <summary>
        /// Get OAuth authorization URL
        /// </summary>
        public async Task<PlusApiResultOAuthLoginResponseVO?> CreateGetAuthUrlAsync(OAuthLoginRequestForm body)
        {
            return await _client.PostAsync<PlusApiResultOAuthLoginResponseVO>(ApiPaths.BackendPath("/auth/oauth/authorize"), body);
        }

        /// <summary>
        /// Handle OAuth callback
        /// </summary>
        public async Task<PlusApiResultLoginResultVO?> HandleCallbackAsync(OAuthCallbackForm body)
        {
            return await _client.PostAsync<PlusApiResultLoginResultVO>(ApiPaths.BackendPath("/auth/oauth/callback"), body);
        }

        /// <summary>
        /// Check role
        /// </summary>
        public async Task<PlusApiResultBoolean?> HasRoleAsync(RoleCheckForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/auth/authorization/has_role"), body);
        }

        /// <summary>
        /// Check permission
        /// </summary>
        public async Task<PlusApiResultBoolean?> HasPermissionAsync(PermissionCheckForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/auth/authorization/has_permission"), body);
        }

        /// <summary>
        /// Reset password
        /// </summary>
        public async Task<PlusApiResultPasswordResetResultVO?> ResetPasswordAsync(PasswordResetForm body)
        {
            return await _client.PostAsync<PlusApiResultPasswordResetResultVO>(ApiPaths.BackendPath("/auth/authentication/reset_password"), body);
        }

        /// <summary>
        /// Request password reset
        /// </summary>
        public async Task<PlusApiResultPasswordResetResultVO?> RequestPasswordResetAsync(PasswordResetRequestForm body)
        {
            return await _client.PostAsync<PlusApiResultPasswordResetResultVO>(ApiPaths.BackendPath("/auth/authentication/request_password_reset"), body);
        }

        /// <summary>
        /// Register
        /// </summary>
        public async Task<PlusApiResultRegisterResultVO?> RegisterAsync(RegisterForm body)
        {
            return await _client.PostAsync<PlusApiResultRegisterResultVO>(ApiPaths.BackendPath("/auth/authentication/register"), body);
        }

        /// <summary>
        /// Refresh token
        /// </summary>
        public async Task<PlusApiResultLoginResultVO?> RefreshTokenAsync(RefreshTokenForm body)
        {
            return await _client.PostAsync<PlusApiResultLoginResultVO>(ApiPaths.BackendPath("/auth/authentication/refresh_token"), body);
        }

        /// <summary>
        /// Logout
        /// </summary>
        public async Task<PlusApiResultVoid?> LogoutAsync()
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.BackendPath("/auth/authentication/logout"), null);
        }

        /// <summary>
        /// Login
        /// </summary>
        public async Task<LoginResultVO?> LoginAsync(LoginForm body)
        {
            return await _client.PostAsync<LoginResultVO>(ApiPaths.BackendPath("/auth/authentication/login"), body);
        }

        /// <summary>
        /// Change password
        /// </summary>
        public async Task<PlusApiResultBoolean?> ChangePasswordAsync(ChangePasswordForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/auth/authentication/change_password"), body);
        }

        /// <summary>
        /// Get current tenant/organization access token
        /// </summary>
        public async Task<PlusApiResultCurrentAccessTokenVO?> GetCurrentAccessTokenAsync(GetCurrentAccessTokenForm body)
        {
            return await _client.PostAsync<PlusApiResultCurrentAccessTokenVO>(ApiPaths.BackendPath("/auth/access_token/current"), body);
        }

        /// <summary>
        /// Check QR code status
        /// </summary>
        public async Task<PlusApiResultQrCodeStatusVO?> CheckQrCodeStatusAsync(string qrKey)
        {
            return await _client.GetAsync<PlusApiResultQrCodeStatusVO>(ApiPaths.BackendPath($"/auth/qrcode/status/{qrKey}"));
        }

        /// <summary>
        /// Get roles
        /// </summary>
        public async Task<PlusApiResultListString?> GetRolesAsync()
        {
            return await _client.GetAsync<PlusApiResultListString>(ApiPaths.BackendPath("/auth/authorization/roles"));
        }

        /// <summary>
        /// Get permissions
        /// </summary>
        public async Task<PlusApiResultListString?> GetPermissionsAsync()
        {
            return await _client.GetAsync<PlusApiResultListString>(ApiPaths.BackendPath("/auth/authorization/permissions"));
        }

        /// <summary>
        /// Get current user
        /// </summary>
        public async Task<PlusApiResultUserVO?> GetCurrentUserAsync()
        {
            return await _client.GetAsync<PlusApiResultUserVO>(ApiPaths.BackendPath("/auth/authentication/get_current_user"));
        }
    }
}
