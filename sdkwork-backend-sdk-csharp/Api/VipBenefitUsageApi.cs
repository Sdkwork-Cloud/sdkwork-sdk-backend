using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VipBenefitUsageApi
    {
        private readonly HttpClient _client;

        public VipBenefitUsageApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing VIP benefit usage record
        /// </summary>
        public async Task<PlusApiResultPlusVipBenefitUsageVO?> UpdateAsync(PlusVipBenefitUsageForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipBenefitUsageVO>(ApiPaths.BackendPath("/vip/benefit/usage"), body);
        }

        /// <summary>
        /// Create a new VIP benefit usage record
        /// </summary>
        public async Task<PlusApiResultPlusVipBenefitUsageVO?> CreateAsync(PlusVipBenefitUsageForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipBenefitUsageVO>(ApiPaths.BackendPath("/vip/benefit/usage"), body);
        }

        /// <summary>
        /// Get VIP benefit usage records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipBenefitUsageVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipBenefitUsageVO>(ApiPaths.BackendPath("/vip/benefit/usage/list"), body, query);
        }

        /// <summary>
        /// Get all VIP benefit usage records
        /// </summary>
        public async Task<PlusApiResultListPlusVipBenefitUsageVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipBenefitUsageVO>(ApiPaths.BackendPath("/vip/benefit/usage/list/all"), body);
        }

        /// <summary>
        /// Get a VIP benefit usage record by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipBenefitUsageVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipBenefitUsageVO>(ApiPaths.BackendPath($"/vip/benefit/usage/{id}"));
        }

        /// <summary>
        /// Delete a VIP benefit usage record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/benefit/usage/{id}"));
        }
    }
}
