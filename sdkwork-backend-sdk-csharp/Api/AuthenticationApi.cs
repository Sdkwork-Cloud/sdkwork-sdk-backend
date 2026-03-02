using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AuthenticationApi
    {
        private readonly HttpClient _client;

        public AuthenticationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 重置密码
        /// </summary>
        public async Task<PlusApiResultPasswordResetResultVO?> ResetPasswordAsync(PasswordResetForm body)
        {
            return await _client.PostAsync<PlusApiResultPasswordResetResultVO>(ApiPaths.BackendPath("/auth/authentication/reset_password"), body);
        }

        /// <summary>
        /// 请求密码重置
        /// </summary>
        public async Task<PlusApiResultPasswordResetResultVO?> RequestPasswordResetAsync(PasswordResetRequestForm body)
        {
            return await _client.PostAsync<PlusApiResultPasswordResetResultVO>(ApiPaths.BackendPath("/auth/authentication/request_password_reset"), body);
        }

        /// <summary>
        /// 用户注册
        /// </summary>
        public async Task<PlusApiResultRegisterResultVO?> RegisterAsync(RegisterForm body)
        {
            return await _client.PostAsync<PlusApiResultRegisterResultVO>(ApiPaths.BackendPath("/auth/authentication/register"), body);
        }

        /// <summary>
        /// 刷新访问令牌
        /// </summary>
        public async Task<PlusApiResultLoginResultVO?> RefreshTokenAsync(RefreshTokenForm body)
        {
            return await _client.PostAsync<PlusApiResultLoginResultVO>(ApiPaths.BackendPath("/auth/authentication/refresh_token"), body);
        }

        /// <summary>
        /// 退出登录
        /// </summary>
        public async Task<PlusApiResultVoid?> LogoutAsync()
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.BackendPath("/auth/authentication/logout"), null);
        }

        /// <summary>
        /// 用户登录
        /// </summary>
        public async Task<LoginResultVO?> LoginAsync(LoginForm body)
        {
            return await _client.PostAsync<LoginResultVO>(ApiPaths.BackendPath("/auth/authentication/login"), body);
        }

        /// <summary>
        /// 修改密码
        /// </summary>
        public async Task<PlusApiResultBoolean?> ChangePasswordAsync(ChangePasswordForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/auth/authentication/change_password"), body);
        }

        /// <summary>
        /// 获取当前用户信息
        /// </summary>
        public async Task<PlusApiResultUserVO?> GetCurrentUserAsync()
        {
            return await _client.GetAsync<PlusApiResultUserVO>(ApiPaths.BackendPath("/auth/authentication/get_current_user"));
        }
    }
}
