using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class UserCouponApi
    {
        private readonly HttpClient _client;

        public UserCouponApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing user coupon
        /// </summary>
        public async Task<PlusApiResultPlusUserCouponVO?> UpdateAsync(PlusUserCouponForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusUserCouponVO>(ApiPaths.BackendPath("/user/coupon"), body);
        }

        /// <summary>
        /// Create a new user coupon
        /// </summary>
        public async Task<PlusApiResultPlusUserCouponVO?> CreateAsync(PlusUserCouponForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusUserCouponVO>(ApiPaths.BackendPath("/user/coupon"), body);
        }

        /// <summary>
        /// Get user coupons by page
        /// </summary>
        public async Task<PlusApiResultPagePlusUserCouponVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusUserCouponVO>(ApiPaths.BackendPath("/user/coupon/list"), body, query);
        }

        /// <summary>
        /// Get all user coupons
        /// </summary>
        public async Task<PlusApiResultListPlusUserCouponVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusUserCouponVO>(ApiPaths.BackendPath("/user/coupon/list/all"), body);
        }

        /// <summary>
        /// Get a user coupon by ID
        /// </summary>
        public async Task<PlusApiResultPlusUserCouponVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusUserCouponVO>(ApiPaths.BackendPath($"/user/coupon/{id}"));
        }

        /// <summary>
        /// Delete a user coupon
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/user/coupon/{id}"));
        }
    }
}
