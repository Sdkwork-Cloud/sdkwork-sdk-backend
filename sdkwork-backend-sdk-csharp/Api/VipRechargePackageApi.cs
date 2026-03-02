using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VipRechargePackageApi
    {
        private readonly HttpClient _client;

        public VipRechargePackageApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing VIP recharge package
        /// </summary>
        public async Task<PlusApiResultPlusVipRechargePackVO?> UpdateAsync(PlusVipRechargePackForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipRechargePackVO>(ApiPaths.BackendPath("/vip/recharge/pack"), body);
        }

        /// <summary>
        /// Create a new VIP recharge package
        /// </summary>
        public async Task<PlusApiResultPlusVipRechargePackVO?> CreateAsync(PlusVipRechargePackForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipRechargePackVO>(ApiPaths.BackendPath("/vip/recharge/pack"), body);
        }

        /// <summary>
        /// Get VIP recharge packages by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipRechargePackVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipRechargePackVO>(ApiPaths.BackendPath("/vip/recharge/pack/list"), body, query);
        }

        /// <summary>
        /// Get all VIP recharge packages
        /// </summary>
        public async Task<PlusApiResultListPlusVipRechargePackVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipRechargePackVO>(ApiPaths.BackendPath("/vip/recharge/pack/list/all"), body);
        }

        /// <summary>
        /// Get a VIP recharge package by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipRechargePackVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipRechargePackVO>(ApiPaths.BackendPath($"/vip/recharge/pack/{id}"));
        }

        /// <summary>
        /// Delete a VIP recharge package
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/recharge/pack/{id}"));
        }
    }
}
