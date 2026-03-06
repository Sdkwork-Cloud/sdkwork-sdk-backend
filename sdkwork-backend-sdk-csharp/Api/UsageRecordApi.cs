using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class UsageRecordApi
    {
        private readonly HttpClient _client;

        public UsageRecordApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing usage record
        /// </summary>
        public async Task<PlusApiResultUsageRecordVO?> UpdateAsync(UsageRecordForm body)
        {
            return await _client.PutAsync<PlusApiResultUsageRecordVO>(ApiPaths.BackendPath("/usage/record"), body);
        }

        /// <summary>
        /// Create a new usage record
        /// </summary>
        public async Task<PlusApiResultUsageRecordVO?> CreateAsync(UsageRecordForm body)
        {
            return await _client.PostAsync<PlusApiResultUsageRecordVO>(ApiPaths.BackendPath("/usage/record"), body);
        }

        /// <summary>
        /// Get usage records by page
        /// </summary>
        public async Task<PlusApiResultPageUsageRecordVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPageUsageRecordVO>(ApiPaths.BackendPath("/usage/record/list"), body, query);
        }

        /// <summary>
        /// Get all usage records
        /// </summary>
        public async Task<PlusApiResultListUsageRecordVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListUsageRecordVO>(ApiPaths.BackendPath("/usage/record/list/all"), body);
        }

        /// <summary>
        /// Get a usage record by ID
        /// </summary>
        public async Task<PlusApiResultUsageRecordVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultUsageRecordVO>(ApiPaths.BackendPath($"/usage/record/{id}"));
        }

        /// <summary>
        /// Delete a usage record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/usage/record/{id}"));
        }
    }
}
