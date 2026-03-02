using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VipBenefitApi
    {
        private readonly HttpClient _client;

        public VipBenefitApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing VIP benefit
        /// </summary>
        public async Task<PlusApiResultPlusVipBenefitVO?> UpdateAsync(PlusVipBenefitForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipBenefitVO>(ApiPaths.BackendPath("/vip/benefit"), body);
        }

        /// <summary>
        /// Create a new VIP benefit
        /// </summary>
        public async Task<PlusApiResultPlusVipBenefitVO?> CreateAsync(PlusVipBenefitForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipBenefitVO>(ApiPaths.BackendPath("/vip/benefit"), body);
        }

        /// <summary>
        /// Get VIP benefits by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipBenefitVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipBenefitVO>(ApiPaths.BackendPath("/vip/benefit/list"), body, query);
        }

        /// <summary>
        /// Get all VIP benefits
        /// </summary>
        public async Task<PlusApiResultListPlusVipBenefitVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipBenefitVO>(ApiPaths.BackendPath("/vip/benefit/list/all"), body);
        }

        /// <summary>
        /// Get a VIP benefit by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipBenefitVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipBenefitVO>(ApiPaths.BackendPath($"/vip/benefit/{id}"));
        }

        /// <summary>
        /// Delete a VIP benefit
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/benefit/{id}"));
        }
    }
}
