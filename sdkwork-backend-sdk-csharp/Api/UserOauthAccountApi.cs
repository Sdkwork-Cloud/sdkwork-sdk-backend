using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class UserOauthAccountApi
    {
        private readonly HttpClient _client;

        public UserOauthAccountApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update user OAuth account
        /// </summary>
        public async Task<PlusApiResultPlusUserOAuthAccountVO?> UpdateAsync(PlusUserOAuthAccountForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusUserOAuthAccountVO>(ApiPaths.BackendPath("/user/oauth/account"), body);
        }

        /// <summary>
        /// Create user OAuth account
        /// </summary>
        public async Task<PlusApiResultPlusUserOAuthAccountVO?> CreateAsync(PlusUserOAuthAccountForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusUserOAuthAccountVO>(ApiPaths.BackendPath("/user/oauth/account"), body);
        }

        /// <summary>
        /// Get user OAuth accounts by page
        /// </summary>
        public async Task<PlusApiResultPagePlusUserOAuthAccountVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusUserOAuthAccountVO>(ApiPaths.BackendPath("/user/oauth/account/list"), body, query);
        }

        /// <summary>
        /// Get all user OAuth accounts
        /// </summary>
        public async Task<PlusApiResultListPlusUserOAuthAccountVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusUserOAuthAccountVO>(ApiPaths.BackendPath("/user/oauth/account/list/all"), body);
        }

        /// <summary>
        /// Get user OAuth account by ID
        /// </summary>
        public async Task<PlusApiResultPlusUserOAuthAccountVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusUserOAuthAccountVO>(ApiPaths.BackendPath($"/user/oauth/account/{id}"));
        }

        /// <summary>
        /// Delete user OAuth account
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/user/oauth/account/{id}"));
        }
    }
}
