using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class UserApi
    {
        private readonly HttpClient _client;

        public UserApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing user
        /// </summary>
        public async Task<PlusApiResultPlusUserVO?> UpdateAsync(PlusUserForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusUserVO>(ApiPaths.BackendPath("/user"), body);
        }

        /// <summary>
        /// Create a new user
        /// </summary>
        public async Task<PlusApiResultPlusUserVO?> CreateAsync(PlusUserForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusUserVO>(ApiPaths.BackendPath("/user"), body);
        }

        /// <summary>
        /// Get users by page
        /// </summary>
        public async Task<PlusApiResultPagePlusUserVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusUserVO>(ApiPaths.BackendPath("/user/list"), body, query);
        }

        /// <summary>
        /// Get all users
        /// </summary>
        public async Task<PlusApiResultListPlusUserVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusUserVO>(ApiPaths.BackendPath("/user/list/all"), body);
        }

        /// <summary>
        /// Get a user by ID
        /// </summary>
        public async Task<PlusApiResultPlusUserVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusUserVO>(ApiPaths.BackendPath($"/user/{id}"));
        }

        /// <summary>
        /// Delete a user
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/user/{id}"));
        }

        /// <summary>
        /// Get current user profile
        /// </summary>
        public async Task<PlusApiResultPlusUserProfileVO?> GetProfileAsync()
        {
            return await _client.GetAsync<PlusApiResultPlusUserProfileVO>(ApiPaths.BackendPath("/user/profile"));
        }
    }
}
