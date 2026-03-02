using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class FeedsApi
    {
        private readonly HttpClient _client;

        public FeedsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing feeds entry
        /// </summary>
        public async Task<PlusApiResultPlusFeedsVO?> UpdateAsync(PlusFeedsForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusFeedsVO>(ApiPaths.BackendPath("/feeds"), body);
        }

        /// <summary>
        /// Create a new feeds entry
        /// </summary>
        public async Task<PlusApiResultPlusFeedsVO?> CreateAsync(PlusFeedsForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusFeedsVO>(ApiPaths.BackendPath("/feeds"), body);
        }

        /// <summary>
        /// Get feeds entries by page
        /// </summary>
        public async Task<PlusApiResultPagePlusFeedsVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusFeedsVO>(ApiPaths.BackendPath("/feeds/list"), body, query);
        }

        /// <summary>
        /// Get all feeds entries
        /// </summary>
        public async Task<PlusApiResultListPlusFeedsVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusFeedsVO>(ApiPaths.BackendPath("/feeds/list/all"), body);
        }

        /// <summary>
        /// Get a feeds entry by ID
        /// </summary>
        public async Task<PlusApiResultPlusFeedsVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusFeedsVO>(ApiPaths.BackendPath($"/feeds/{id}"));
        }

        /// <summary>
        /// Delete a feeds entry
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/feeds/{id}"));
        }
    }
}
