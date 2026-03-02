using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VipPackageApi
    {
        private readonly HttpClient _client;

        public VipPackageApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update VIP Package
        /// </summary>
        public async Task<PlusApiResultPlusVipPackVO?> UpdateAsync(PlusVipPackForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipPackVO>(ApiPaths.BackendPath("/vip/pack"), body);
        }

        /// <summary>
        /// Create VIP Package
        /// </summary>
        public async Task<PlusApiResultPlusVipPackVO?> CreateAsync(PlusVipPackForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipPackVO>(ApiPaths.BackendPath("/vip/pack"), body);
        }

        /// <summary>
        /// Get VIP Packages by Page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipPackVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipPackVO>(ApiPaths.BackendPath("/vip/pack/list"), body, query);
        }

        /// <summary>
        /// Get All VIP Packages
        /// </summary>
        public async Task<PlusApiResultListPlusVipPackVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipPackVO>(ApiPaths.BackendPath("/vip/pack/list/all"), body);
        }

        /// <summary>
        /// Get VIP Package by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipPackVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipPackVO>(ApiPaths.BackendPath($"/vip/pack/{id}"));
        }

        /// <summary>
        /// Delete VIP Package
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/pack/{id}"));
        }
    }
}
