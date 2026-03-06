using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ApiKeyApi
    {
        private readonly HttpClient _client;

        public ApiKeyApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing API key
        /// </summary>
        public async Task<PlusApiResultPlusApiKeyVO?> UpdateAsync(PlusApiKeyForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusApiKeyVO>(ApiPaths.BackendPath("/apikey"), body);
        }

        /// <summary>
        /// Create a new API key
        /// </summary>
        public async Task<PlusApiResultPlusApiKeyVO?> CreateAsync(PlusApiKeyForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusApiKeyVO>(ApiPaths.BackendPath("/apikey"), body);
        }

        /// <summary>
        /// Get API key detail for current user
        /// </summary>
        public async Task<PlusApiResultPlusApiKeyVO?> GetMyAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusApiKeyVO>(ApiPaths.BackendPath($"/apikey/my/{id}"));
        }

        /// <summary>
        /// Update API key for current user
        /// </summary>
        public async Task<PlusApiResultPlusApiKeyVO?> UpdateMyAsync(string id, PlusApiKeySelfUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusApiKeyVO>(ApiPaths.BackendPath($"/apikey/my/{id}"), body);
        }

        /// <summary>
        /// Delete API key for current user
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteMyAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/apikey/my/{id}"));
        }

        /// <summary>
        /// Create API key for current user
        /// </summary>
        public async Task<PlusApiResultPlusApiKeyVO?> CreateMyAsync(PlusApiKeySelfCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusApiKeyVO>(ApiPaths.BackendPath("/apikey/my"), body);
        }

        /// <summary>
        /// Rotate API key for current user
        /// </summary>
        public async Task<PlusApiResultPlusApiKeyVO?> RotateMyAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusApiKeyVO>(ApiPaths.BackendPath($"/apikey/my/{id}/rotate"), null);
        }

        /// <summary>
        /// Enable API key for current user
        /// </summary>
        public async Task<PlusApiResultPlusApiKeyVO?> EnableMyAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusApiKeyVO>(ApiPaths.BackendPath($"/apikey/my/{id}/enable"), null);
        }

        /// <summary>
        /// Disable API key for current user
        /// </summary>
        public async Task<PlusApiResultPlusApiKeyVO?> DisableMyAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusApiKeyVO>(ApiPaths.BackendPath($"/apikey/my/{id}/disable"), null);
        }

        /// <summary>
        /// Get API keys by page
        /// </summary>
        public async Task<PlusApiResultPagePlusApiKeyVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusApiKeyVO>(ApiPaths.BackendPath("/apikey/list"), body, query);
        }

        /// <summary>
        /// Get all API keys
        /// </summary>
        public async Task<PlusApiResultListPlusApiKeyVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusApiKeyVO>(ApiPaths.BackendPath("/apikey/list/all"), body);
        }

        /// <summary>
        /// Get an API key by ID
        /// </summary>
        public async Task<PlusApiResultPlusApiKeyVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusApiKeyVO>(ApiPaths.BackendPath($"/apikey/{id}"));
        }

        /// <summary>
        /// Delete an API key
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/apikey/{id}"));
        }

        /// <summary>
        /// List API keys for current user
        /// </summary>
        public async Task<PlusApiResultListPlusApiKeyVO?> ListMyApiKeysAsync()
        {
            return await _client.GetAsync<PlusApiResultListPlusApiKeyVO>(ApiPaths.BackendPath("/apikey/my/list"));
        }
    }
}
