using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VerificationApi
    {
        private readonly HttpClient _client;

        public VerificationApi(HttpClient client)
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
    }
}
