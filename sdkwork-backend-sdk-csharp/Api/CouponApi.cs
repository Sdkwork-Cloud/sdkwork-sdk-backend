using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class CouponApi
    {
        private readonly HttpClient _client;

        public CouponApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing coupon template
        /// </summary>
        public async Task<PlusApiResultPlusCouponVO?> UpdateAsync(PlusCouponForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusCouponVO>(ApiPaths.BackendPath("/coupon"), body);
        }

        /// <summary>
        /// Create a new coupon template
        /// </summary>
        public async Task<PlusApiResultPlusCouponVO?> CreateAsync(PlusCouponForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusCouponVO>(ApiPaths.BackendPath("/coupon"), body);
        }

        /// <summary>
        /// Get coupon templates by page
        /// </summary>
        public async Task<PlusApiResultPagePlusCouponVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusCouponVO>(ApiPaths.BackendPath("/coupon/list"), body, query);
        }

        /// <summary>
        /// Get all coupon templates
        /// </summary>
        public async Task<PlusApiResultListPlusCouponVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusCouponVO>(ApiPaths.BackendPath("/coupon/list/all"), body);
        }

        /// <summary>
        /// Get a coupon template by ID
        /// </summary>
        public async Task<PlusApiResultPlusCouponVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusCouponVO>(ApiPaths.BackendPath($"/coupon/{id}"));
        }

        /// <summary>
        /// Delete a coupon template
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/coupon/{id}"));
        }
    }
}
