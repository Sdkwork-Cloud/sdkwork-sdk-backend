using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VipRechargeApi
    {
        private readonly HttpClient _client;

        public VipRechargeApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing VIP recharge record
        /// </summary>
        public async Task<PlusApiResultPlusVipRechargeVO?> UpdateAsync(PlusVipRechargeForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipRechargeVO>(ApiPaths.BackendPath("/vip/recharge"), body);
        }

        /// <summary>
        /// Create a new VIP recharge record
        /// </summary>
        public async Task<PlusApiResultPlusVipRechargeVO?> CreateAsync(PlusVipRechargeForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipRechargeVO>(ApiPaths.BackendPath("/vip/recharge"), body);
        }

        /// <summary>
        /// Get VIP recharge records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipRechargeVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipRechargeVO>(ApiPaths.BackendPath("/vip/recharge/list"), body, query);
        }

        /// <summary>
        /// Get all VIP recharge records
        /// </summary>
        public async Task<PlusApiResultListPlusVipRechargeVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipRechargeVO>(ApiPaths.BackendPath("/vip/recharge/list/all"), body);
        }

        /// <summary>
        /// Get a VIP recharge record by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipRechargeVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipRechargeVO>(ApiPaths.BackendPath($"/vip/recharge/{id}"));
        }

        /// <summary>
        /// Delete a VIP recharge record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/recharge/{id}"));
        }
    }
}
