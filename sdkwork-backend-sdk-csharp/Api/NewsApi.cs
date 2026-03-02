using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class NewsApi
    {
        private readonly HttpClient _client;

        public NewsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing news
        /// </summary>
        public async Task<PlusApiResultPlusNewsVO?> UpdateAsync(PlusNewsForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusNewsVO>(ApiPaths.BackendPath("/news"), body);
        }

        /// <summary>
        /// Create a new news
        /// </summary>
        public async Task<PlusApiResultPlusNewsVO?> CreateAsync(PlusNewsForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusNewsVO>(ApiPaths.BackendPath("/news"), body);
        }

        /// <summary>
        /// Get news by page
        /// </summary>
        public async Task<PlusApiResultPagePlusNewsVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusNewsVO>(ApiPaths.BackendPath("/news/list"), body, query);
        }

        /// <summary>
        /// Get all news
        /// </summary>
        public async Task<PlusApiResultListPlusNewsVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusNewsVO>(ApiPaths.BackendPath("/news/list/all"), body);
        }

        /// <summary>
        /// Get a news by ID
        /// </summary>
        public async Task<PlusApiResultPlusNewsVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusNewsVO>(ApiPaths.BackendPath($"/news/{id}"));
        }

        /// <summary>
        /// Delete a news
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/news/{id}"));
        }
    }
}
