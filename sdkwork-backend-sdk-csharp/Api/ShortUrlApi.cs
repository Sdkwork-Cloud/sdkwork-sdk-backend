using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ShortUrlApi
    {
        private readonly HttpClient _client;

        public ShortUrlApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update short URL
        /// </summary>
        public async Task<PlusApiResultShortUrlVO?> UpdateAsync(ShortUrlForm body)
        {
            return await _client.PutAsync<PlusApiResultShortUrlVO>(ApiPaths.BackendPath("/short_url"), body);
        }

        /// <summary>
        /// Create short URL
        /// </summary>
        public async Task<PlusApiResultShortUrlVO?> CreateAsync(ShortUrlForm body)
        {
            return await _client.PostAsync<PlusApiResultShortUrlVO>(ApiPaths.BackendPath("/short_url"), body);
        }

        /// <summary>
        /// Get short URLs by page
        /// </summary>
        public async Task<PlusApiResultPageShortUrlVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPageShortUrlVO>(ApiPaths.BackendPath("/short_url/list"), body, query);
        }

        /// <summary>
        /// Get all short URLs
        /// </summary>
        public async Task<PlusApiResultListShortUrlVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListShortUrlVO>(ApiPaths.BackendPath("/short_url/list/all"), body);
        }

        /// <summary>
        /// Get short URL details
        /// </summary>
        public async Task<PlusApiResultShortUrlVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultShortUrlVO>(ApiPaths.BackendPath($"/short_url/{id}"));
        }

        /// <summary>
        /// Delete short URL
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/short_url/{id}"));
        }
    }
}
