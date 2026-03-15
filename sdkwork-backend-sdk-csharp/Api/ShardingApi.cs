using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ShardingApi
    {
        private readonly HttpClient _client;

        public ShardingApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update Sharding Key
        /// </summary>
        public async Task<PlusApiResultPlusShardingKeyVO?> UpdateAsync(PlusShardingKeyForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusShardingKeyVO>(ApiPaths.BackendPath("/sharding/key"), body);
        }

        /// <summary>
        /// Create Sharding Key
        /// </summary>
        public async Task<PlusApiResultPlusShardingKeyVO?> CreateAsync(PlusShardingKeyForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusShardingKeyVO>(ApiPaths.BackendPath("/sharding/key"), body);
        }

        /// <summary>
        /// List Sharding Keys by Page
        /// </summary>
        public async Task<PlusApiResultPagePlusShardingKeyVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusShardingKeyVO>(ApiPaths.BackendPath("/sharding/key/list"), body, query);
        }

        /// <summary>
        /// List All Sharding Keys
        /// </summary>
        public async Task<PlusApiResultListPlusShardingKeyVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusShardingKeyVO>(ApiPaths.BackendPath("/sharding/key/list/all"), body);
        }

        /// <summary>
        /// Get Sharding Key by ID
        /// </summary>
        public async Task<PlusApiResultPlusShardingKeyVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusShardingKeyVO>(ApiPaths.BackendPath($"/sharding/key/{id}"));
        }

        /// <summary>
        /// Delete Sharding Key
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/sharding/key/{id}"));
        }
    }
}
