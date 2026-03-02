using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VipUserApi
    {
        private readonly HttpClient _client;

        public VipUserApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing VIP user
        /// </summary>
        public async Task<PlusApiResultPlusVipUserVO?> UpdateAsync(PlusVipUserForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipUserVO>(ApiPaths.BackendPath("/vip/user"), body);
        }

        /// <summary>
        /// Create a new VIP user
        /// </summary>
        public async Task<PlusApiResultPlusVipUserVO?> CreateAsync(PlusVipUserForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipUserVO>(ApiPaths.BackendPath("/vip/user"), body);
        }

        /// <summary>
        /// Get VIP users by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipUserVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipUserVO>(ApiPaths.BackendPath("/vip/user/list"), body, query);
        }

        /// <summary>
        /// Get all VIP users
        /// </summary>
        public async Task<PlusApiResultListPlusVipUserVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipUserVO>(ApiPaths.BackendPath("/vip/user/list/all"), body);
        }

        /// <summary>
        /// Get a VIP user by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipUserVO?> GetCurrentUserAsync()
        {
            return await _client.PostAsync<PlusApiResultPlusVipUserVO>(ApiPaths.BackendPath("/vip/user/get_current_user"), null);
        }

        /// <summary>
        /// Get a VIP user by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipUserVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipUserVO>(ApiPaths.BackendPath($"/vip/user/{id}"));
        }

        /// <summary>
        /// Delete a VIP user
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/user/{id}"));
        }
    }
}
