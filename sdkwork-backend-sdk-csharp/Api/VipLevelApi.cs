using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VipLevelApi
    {
        private readonly HttpClient _client;

        public VipLevelApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing VIP level
        /// </summary>
        public async Task<PlusApiResultPlusVipLevelVO?> UpdateAsync(PlusVipLevelForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipLevelVO>(ApiPaths.BackendPath("/vip/level"), body);
        }

        /// <summary>
        /// Create a new VIP level
        /// </summary>
        public async Task<PlusApiResultPlusVipLevelVO?> CreateAsync(PlusVipLevelForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipLevelVO>(ApiPaths.BackendPath("/vip/level"), body);
        }

        /// <summary>
        /// Get VIP levels by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipLevelVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipLevelVO>(ApiPaths.BackendPath("/vip/level/list"), body, query);
        }

        /// <summary>
        /// Get all VIP levels
        /// </summary>
        public async Task<PlusApiResultListPlusVipLevelVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipLevelVO>(ApiPaths.BackendPath("/vip/level/list/all"), body);
        }

        /// <summary>
        /// Get a VIP level by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipLevelVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipLevelVO>(ApiPaths.BackendPath($"/vip/level/{id}"));
        }

        /// <summary>
        /// Delete a VIP level
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/level/{id}"));
        }
    }
}
