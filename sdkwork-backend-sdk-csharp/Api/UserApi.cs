using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class UserApi
    {
        private readonly HttpClient _client;

        public UserApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing user
        /// </summary>
        public async Task<PlusApiResultPlusUserVO?> UpdateAsync(PlusUserForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusUserVO>(ApiPaths.BackendPath("/user"), body);
        }

        /// <summary>
        /// Create a new user
        /// </summary>
        public async Task<PlusApiResultPlusUserVO?> CreateAsync(PlusUserForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusUserVO>(ApiPaths.BackendPath("/user"), body);
        }

        /// <summary>
        /// Update user OAuth account
        /// </summary>
        public async Task<PlusApiResultPlusUserOAuthAccountVO?> UpdateAccountAsync(PlusUserOAuthAccountForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusUserOAuthAccountVO>(ApiPaths.BackendPath("/user/oauth/account"), body);
        }

        /// <summary>
        /// Create user OAuth account
        /// </summary>
        public async Task<PlusApiResultPlusUserOAuthAccountVO?> CreateAccountAsync(PlusUserOAuthAccountForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusUserOAuthAccountVO>(ApiPaths.BackendPath("/user/oauth/account"), body);
        }

        /// <summary>
        /// Update an existing user coupon
        /// </summary>
        public async Task<PlusApiResultPlusUserCouponVO?> UpdateCouponAsync(PlusUserCouponForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusUserCouponVO>(ApiPaths.BackendPath("/user/coupon"), body);
        }

        /// <summary>
        /// Create a new user coupon
        /// </summary>
        public async Task<PlusApiResultPlusUserCouponVO?> CreateCouponAsync(PlusUserCouponForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusUserCouponVO>(ApiPaths.BackendPath("/user/coupon"), body);
        }

        /// <summary>
        /// Update user-card binding
        /// </summary>
        public async Task<PlusApiResultPlusUserCardVO?> UpdateCardAsync(PlusUserCardForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusUserCardVO>(ApiPaths.BackendPath("/user/card"), body);
        }

        /// <summary>
        /// Create user-card binding
        /// </summary>
        public async Task<PlusApiResultPlusUserCardVO?> CreateCardAsync(PlusUserCardForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusUserCardVO>(ApiPaths.BackendPath("/user/card"), body);
        }

        /// <summary>
        /// Update an existing user address
        /// </summary>
        public async Task<PlusApiResultPlusUserAddressVO?> UpdateAddressAsync(PlusUserAddressForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusUserAddressVO>(ApiPaths.BackendPath("/user/address"), body);
        }

        /// <summary>
        /// Create a new user address
        /// </summary>
        public async Task<PlusApiResultPlusUserAddressVO?> CreateAddressAsync(PlusUserAddressForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusUserAddressVO>(ApiPaths.BackendPath("/user/address"), body);
        }

        /// <summary>
        /// Get user OAuth accounts by page
        /// </summary>
        public async Task<PlusApiResultPagePlusUserOAuthAccountVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusUserOAuthAccountVO>(ApiPaths.BackendPath("/user/oauth/account/list"), body, query);
        }

        /// <summary>
        /// Get all user OAuth accounts
        /// </summary>
        public async Task<PlusApiResultListPlusUserOAuthAccountVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusUserOAuthAccountVO>(ApiPaths.BackendPath("/user/oauth/account/list/all"), body);
        }

        /// <summary>
        /// Get users by page
        /// </summary>
        public async Task<PlusApiResultPagePlusUserVO?> CreateListByPageUserAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusUserVO>(ApiPaths.BackendPath("/user/list"), body, query);
        }

        /// <summary>
        /// Get all users
        /// </summary>
        public async Task<PlusApiResultListPlusUserVO?> CreateListAllEntitiesUserAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusUserVO>(ApiPaths.BackendPath("/user/list/all"), body);
        }

        /// <summary>
        /// Get user coupons by page
        /// </summary>
        public async Task<PlusApiResultPagePlusUserCouponVO?> CreateListByPageCouponAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusUserCouponVO>(ApiPaths.BackendPath("/user/coupon/list"), body, query);
        }

        /// <summary>
        /// Get all user coupons
        /// </summary>
        public async Task<PlusApiResultListPlusUserCouponVO?> CreateListAllEntitiesCouponAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusUserCouponVO>(ApiPaths.BackendPath("/user/coupon/list/all"), body);
        }

        /// <summary>
        /// Get user-card bindings by page
        /// </summary>
        public async Task<PlusApiResultPagePlusUserCardVO?> CreateListByPageCardAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusUserCardVO>(ApiPaths.BackendPath("/user/card/list"), body, query);
        }

        /// <summary>
        /// Get all user-card bindings
        /// </summary>
        public async Task<PlusApiResultListPlusUserCardVO?> CreateListAllEntitiesCardAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusUserCardVO>(ApiPaths.BackendPath("/user/card/list/all"), body);
        }

        /// <summary>
        /// Get addresses by page
        /// </summary>
        public async Task<PlusApiResultPagePlusUserAddressVO?> CreateListByPageAddressAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusUserAddressVO>(ApiPaths.BackendPath("/user/address/list"), body, query);
        }

        /// <summary>
        /// Get all user addresses
        /// </summary>
        public async Task<PlusApiResultListPlusUserAddressVO?> CreateListAllEntitiesAddressAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusUserAddressVO>(ApiPaths.BackendPath("/user/address/list/all"), body);
        }

        /// <summary>
        /// Get a user by ID
        /// </summary>
        public async Task<PlusApiResultPlusUserVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusUserVO>(ApiPaths.BackendPath($"/user/{id}"));
        }

        /// <summary>
        /// Delete a user
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/user/{id}"));
        }

        /// <summary>
        /// Get current user profile
        /// </summary>
        public async Task<PlusApiResultPlusUserProfileVO?> GetProfileAsync()
        {
            return await _client.GetAsync<PlusApiResultPlusUserProfileVO>(ApiPaths.BackendPath("/user/profile"));
        }

        /// <summary>
        /// Get user OAuth account by ID
        /// </summary>
        public async Task<PlusApiResultPlusUserOAuthAccountVO?> GetByIdAccountAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusUserOAuthAccountVO>(ApiPaths.BackendPath($"/user/oauth/account/{id}"));
        }

        /// <summary>
        /// Delete user OAuth account
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAccountAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/user/oauth/account/{id}"));
        }

        /// <summary>
        /// Get a user coupon by ID
        /// </summary>
        public async Task<PlusApiResultPlusUserCouponVO?> GetByIdCouponAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusUserCouponVO>(ApiPaths.BackendPath($"/user/coupon/{id}"));
        }

        /// <summary>
        /// Delete a user coupon
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteCouponAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/user/coupon/{id}"));
        }

        /// <summary>
        /// Get user-card binding by ID
        /// </summary>
        public async Task<PlusApiResultPlusUserCardVO?> GetByIdCardAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusUserCardVO>(ApiPaths.BackendPath($"/user/card/{id}"));
        }

        /// <summary>
        /// Delete user-card binding
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteCardAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/user/card/{id}"));
        }

        /// <summary>
        /// Get address by ID
        /// </summary>
        public async Task<PlusApiResultPlusUserAddressVO?> GetByIdAddressAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusUserAddressVO>(ApiPaths.BackendPath($"/user/address/{id}"));
        }

        /// <summary>
        /// Delete a user address
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAddressAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/user/address/{id}"));
        }
    }
}
