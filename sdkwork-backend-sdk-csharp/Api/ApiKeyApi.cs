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
    }
}
