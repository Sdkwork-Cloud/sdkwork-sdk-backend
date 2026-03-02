using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class UserCardApi
    {
        private readonly HttpClient _client;

        public UserCardApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update user-card binding
        /// </summary>
        public async Task<PlusApiResultPlusUserCardVO?> UpdateAsync(PlusUserCardForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusUserCardVO>(ApiPaths.BackendPath("/user/card"), body);
        }

        /// <summary>
        /// Create user-card binding
        /// </summary>
        public async Task<PlusApiResultPlusUserCardVO?> CreateAsync(PlusUserCardForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusUserCardVO>(ApiPaths.BackendPath("/user/card"), body);
        }

        /// <summary>
        /// Get user-card bindings by page
        /// </summary>
        public async Task<PlusApiResultPagePlusUserCardVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusUserCardVO>(ApiPaths.BackendPath("/user/card/list"), body, query);
        }

        /// <summary>
        /// Get all user-card bindings
        /// </summary>
        public async Task<PlusApiResultListPlusUserCardVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusUserCardVO>(ApiPaths.BackendPath("/user/card/list/all"), body);
        }

        /// <summary>
        /// Get user-card binding by ID
        /// </summary>
        public async Task<PlusApiResultPlusUserCardVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusUserCardVO>(ApiPaths.BackendPath($"/user/card/{id}"));
        }

        /// <summary>
        /// Delete user-card binding
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/user/card/{id}"));
        }
    }
}
