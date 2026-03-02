using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class CouponTemplateApi
    {
        private readonly HttpClient _client;

        public CouponTemplateApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing coupon template
        /// </summary>
        public async Task<PlusApiResultPlusCouponTemplateVO?> UpdateAsync(PlusCouponTemplateForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusCouponTemplateVO>(ApiPaths.BackendPath("/coupon/template"), body);
        }

        /// <summary>
        /// Create a new coupon template
        /// </summary>
        public async Task<PlusApiResultPlusCouponTemplateVO?> CreateAsync(PlusCouponTemplateForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusCouponTemplateVO>(ApiPaths.BackendPath("/coupon/template"), body);
        }

        /// <summary>
        /// Get coupon templates by page
        /// </summary>
        public async Task<PlusApiResultPagePlusCouponTemplateVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusCouponTemplateVO>(ApiPaths.BackendPath("/coupon/template/list"), body, query);
        }

        /// <summary>
        /// Get all coupon templates
        /// </summary>
        public async Task<PlusApiResultListPlusCouponTemplateVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusCouponTemplateVO>(ApiPaths.BackendPath("/coupon/template/list/all"), body);
        }

        /// <summary>
        /// Get a coupon template by ID
        /// </summary>
        public async Task<PlusApiResultPlusCouponTemplateVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusCouponTemplateVO>(ApiPaths.BackendPath($"/coupon/template/{id}"));
        }

        /// <summary>
        /// Delete a coupon template
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/coupon/template/{id}"));
        }
    }
}
