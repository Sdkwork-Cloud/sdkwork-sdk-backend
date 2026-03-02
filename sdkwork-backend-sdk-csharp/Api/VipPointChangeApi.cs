using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VipPointChangeApi
    {
        private readonly HttpClient _client;

        public VipPointChangeApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing VIP point change record
        /// </summary>
        public async Task<PlusApiResultPlusVipPointChangeVO?> UpdateAsync(PlusVipPointChangeForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipPointChangeVO>(ApiPaths.BackendPath("/vip/point/change"), body);
        }

        /// <summary>
        /// Create a new VIP point change record
        /// </summary>
        public async Task<PlusApiResultPlusVipPointChangeVO?> CreateAsync(PlusVipPointChangeForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipPointChangeVO>(ApiPaths.BackendPath("/vip/point/change"), body);
        }

        /// <summary>
        /// Get VIP point change records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipPointChangeVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipPointChangeVO>(ApiPaths.BackendPath("/vip/point/change/list"), body, query);
        }

        /// <summary>
        /// Get all VIP point change records
        /// </summary>
        public async Task<PlusApiResultListPlusVipPointChangeVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipPointChangeVO>(ApiPaths.BackendPath("/vip/point/change/list/all"), body);
        }

        /// <summary>
        /// Get a VIP point change record by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipPointChangeVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipPointChangeVO>(ApiPaths.BackendPath($"/vip/point/change/{id}"));
        }

        /// <summary>
        /// Delete a VIP point change record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/point/change/{id}"));
        }
    }
}
