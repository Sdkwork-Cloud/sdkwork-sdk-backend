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
        /// Update an existing coupon template
        /// </summary>
        public async Task<PlusApiResultPlusCouponTemplateVO?> UpdateTemplateAsync(PlusCouponTemplateForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusCouponTemplateVO>(ApiPaths.BackendPath("/coupon/template"), body);
        }

        /// <summary>
        /// Create a new coupon template
        /// </summary>
        public async Task<PlusApiResultPlusCouponTemplateVO?> CreateTemplateAsync(PlusCouponTemplateForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusCouponTemplateVO>(ApiPaths.BackendPath("/coupon/template"), body);
        }

        /// <summary>
        /// Exchange coupon by points
        /// </summary>
        public async Task<PlusApiResultPlusUserCouponVO?> ExchangeByPointsAsync(string couponId, CouponPointsExchangeForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusUserCouponVO>(ApiPaths.BackendPath($"/coupon/{couponId}/exchange/points"), body);
        }

        /// <summary>
        /// Get coupon templates by page
        /// </summary>
        public async Task<PlusApiResultPagePlusCouponTemplateVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusCouponTemplateVO>(ApiPaths.BackendPath("/coupon/template/list"), body, query);
        }

        /// <summary>
        /// Get all coupon templates
        /// </summary>
        public async Task<PlusApiResultListPlusCouponTemplateVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusCouponTemplateVO>(ApiPaths.BackendPath("/coupon/template/list/all"), body);
        }

        /// <summary>
        /// Redeem coupon
        /// </summary>
        public async Task<PlusApiResultPlusUserCouponVO?> RedeemAsync(CouponRedeemForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusUserCouponVO>(ApiPaths.BackendPath("/coupon/redeem"), body);
        }

        /// <summary>
        /// Rollback points exchange coupon
        /// </summary>
        public async Task<PlusApiResultPlusUserCouponVO?> RollbackPointsExchangeAsync(string userCouponId, CouponRollbackForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusUserCouponVO>(ApiPaths.BackendPath($"/coupon/my/{userCouponId}/rollback"), body);
        }

        /// <summary>
        /// Get coupon templates by page
        /// </summary>
        public async Task<PlusApiResultPagePlusCouponVO?> CreateListByPageCouponAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusCouponVO>(ApiPaths.BackendPath("/coupon/list"), body, query);
        }

        /// <summary>
        /// Get all coupon templates
        /// </summary>
        public async Task<PlusApiResultListPlusCouponVO?> CreateListAllEntitiesCouponAsync(QueryListForm? body = null)
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

        /// <summary>
        /// Get a coupon template by ID
        /// </summary>
        public async Task<PlusApiResultPlusCouponTemplateVO?> GetByIdTemplateAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusCouponTemplateVO>(ApiPaths.BackendPath($"/coupon/template/{id}"));
        }

        /// <summary>
        /// Delete a coupon template
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteTemplateAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/coupon/template/{id}"));
        }
    }
}
