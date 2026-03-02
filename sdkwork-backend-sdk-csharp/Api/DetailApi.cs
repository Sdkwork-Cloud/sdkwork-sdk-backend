using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class DetailApi
    {
        private readonly HttpClient _client;

        public DetailApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update existing detail content
        /// </summary>
        public async Task<PlusApiResultPlusDetailVO?> UpdateAsync(PlusDetailForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusDetailVO>(ApiPaths.BackendPath("/detail"), body);
        }

        /// <summary>
        /// Create new detail content
        /// </summary>
        public async Task<PlusApiResultPlusDetailVO?> CreateAsync(PlusDetailForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusDetailVO>(ApiPaths.BackendPath("/detail"), body);
        }

        /// <summary>
        /// Get detail contents by page
        /// </summary>
        public async Task<PlusApiResultPagePlusDetailVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusDetailVO>(ApiPaths.BackendPath("/detail/list"), body, query);
        }

        /// <summary>
        /// Get all detail contents
        /// </summary>
        public async Task<PlusApiResultListPlusDetailVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusDetailVO>(ApiPaths.BackendPath("/detail/list/all"), body);
        }

        /// <summary>
        /// Get detail content by ID
        /// </summary>
        public async Task<PlusApiResultPlusDetailVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusDetailVO>(ApiPaths.BackendPath($"/detail/{id}"));
        }

        /// <summary>
        /// Delete detail content
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/detail/{id}"));
        }
    }
}
