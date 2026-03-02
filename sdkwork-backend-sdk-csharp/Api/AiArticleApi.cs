using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AiArticleApi
    {
        private readonly HttpClient _client;

        public AiArticleApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing AI article
        /// </summary>
        public async Task<PlusApiResultPlusArticleVO?> UpdateAsync(PlusArticleForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusArticleVO>(ApiPaths.BackendPath("/article"), body);
        }

        /// <summary>
        /// Create a new AI article
        /// </summary>
        public async Task<PlusApiResultPlusArticleVO?> CreateAsync(PlusArticleForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusArticleVO>(ApiPaths.BackendPath("/article"), body);
        }

        /// <summary>
        /// Get AI articles by page
        /// </summary>
        public async Task<PlusApiResultPagePlusArticleVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusArticleVO>(ApiPaths.BackendPath("/article/list"), body, query);
        }

        /// <summary>
        /// Get all AI articles
        /// </summary>
        public async Task<PlusApiResultListPlusArticleVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusArticleVO>(ApiPaths.BackendPath("/article/list/all"), body);
        }

        /// <summary>
        /// Get an AI article by ID
        /// </summary>
        public async Task<PlusApiResultPlusArticleVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusArticleVO>(ApiPaths.BackendPath($"/article/{id}"));
        }

        /// <summary>
        /// Delete an AI article
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/article/{id}"));
        }
    }
}
