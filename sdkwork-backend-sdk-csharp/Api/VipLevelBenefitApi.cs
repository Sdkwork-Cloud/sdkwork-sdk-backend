using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VipLevelBenefitApi
    {
        private readonly HttpClient _client;

        public VipLevelBenefitApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing VIP level benefit
        /// </summary>
        public async Task<PlusApiResultPlusVipLevelBenefitVO?> UpdateAsync(PlusVipLevelBenefitForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipLevelBenefitVO>(ApiPaths.BackendPath("/vip/level/benefit"), body);
        }

        /// <summary>
        /// Create a new VIP level benefit
        /// </summary>
        public async Task<PlusApiResultPlusVipLevelBenefitVO?> CreateAsync(PlusVipLevelBenefitForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipLevelBenefitVO>(ApiPaths.BackendPath("/vip/level/benefit"), body);
        }

        /// <summary>
        /// Get VIP level benefits by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipLevelBenefitVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipLevelBenefitVO>(ApiPaths.BackendPath("/vip/level/benefit/list"), body, query);
        }

        /// <summary>
        /// Get all VIP level benefits
        /// </summary>
        public async Task<PlusApiResultListPlusVipLevelBenefitVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipLevelBenefitVO>(ApiPaths.BackendPath("/vip/level/benefit/list/all"), body);
        }

        /// <summary>
        /// Get a VIP level benefit by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipLevelBenefitVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipLevelBenefitVO>(ApiPaths.BackendPath($"/vip/level/benefit/{id}"));
        }

        /// <summary>
        /// Delete a VIP level benefit
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/level/benefit/{id}"));
        }
    }
}
