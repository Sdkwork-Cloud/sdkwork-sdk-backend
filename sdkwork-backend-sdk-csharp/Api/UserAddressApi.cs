using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class UserAddressApi
    {
        private readonly HttpClient _client;

        public UserAddressApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing user address
        /// </summary>
        public async Task<PlusApiResultPlusUserAddressVO?> UpdateAsync(PlusUserAddressForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusUserAddressVO>(ApiPaths.BackendPath("/user/address"), body);
        }

        /// <summary>
        /// Create a new user address
        /// </summary>
        public async Task<PlusApiResultPlusUserAddressVO?> CreateAsync(PlusUserAddressForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusUserAddressVO>(ApiPaths.BackendPath("/user/address"), body);
        }

        /// <summary>
        /// Get addresses by page
        /// </summary>
        public async Task<PlusApiResultPagePlusUserAddressVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusUserAddressVO>(ApiPaths.BackendPath("/user/address/list"), body, query);
        }

        /// <summary>
        /// Get all user addresses
        /// </summary>
        public async Task<PlusApiResultListPlusUserAddressVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusUserAddressVO>(ApiPaths.BackendPath("/user/address/list/all"), body);
        }

        /// <summary>
        /// Get address by ID
        /// </summary>
        public async Task<PlusApiResultPlusUserAddressVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusUserAddressVO>(ApiPaths.BackendPath($"/user/address/{id}"));
        }

        /// <summary>
        /// Delete a user address
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/user/address/{id}"));
        }
    }
}
