using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class OauthAuthenticationApi
    {
        private readonly HttpClient _client;

        public OauthAuthenticationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Get OAuth authorization URL
        /// </summary>
        public async Task<OAuthLoginResponse?> GetAuthUrlAsync(OAuthLoginRequestForm body)
        {
            return await _client.PostAsync<OAuthLoginResponse>(ApiPaths.BackendPath("/auth/oauth/get_auth_url"), body);
        }

        /// <summary>
        /// Get OAuth authorization URL
        /// </summary>
        public async Task<OAuthLoginResponse?> CreateGetAuthUrlAsync(OAuthLoginRequestForm body)
        {
            return await _client.PostAsync<OAuthLoginResponse>(ApiPaths.BackendPath("/auth/oauth/authorize"), body);
        }

        /// <summary>
        /// Handle OAuth callback
        /// </summary>
        public async Task<TokenDTO?> HandleCallbackAsync(OAuthCallbackForm body)
        {
            return await _client.PostAsync<TokenDTO>(ApiPaths.BackendPath("/auth/oauth/callback"), body);
        }
    }
}
