using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class RbacUserRoleApi
    {
        private readonly HttpClient _client;

        public RbacUserRoleApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update user-role relationship
        /// </summary>
        public async Task<PlusApiResultPlusUserRoleVO?> UpdateAsync(PlusUserRoleForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusUserRoleVO>(ApiPaths.BackendPath("/rbac/user/role"), body);
        }

        /// <summary>
        /// Create user-role relationship
        /// </summary>
        public async Task<PlusApiResultPlusUserRoleVO?> CreateAsync(PlusUserRoleForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusUserRoleVO>(ApiPaths.BackendPath("/rbac/user/role"), body);
        }

        /// <summary>
        /// Get user-role relationships by page
        /// </summary>
        public async Task<PlusApiResultPagePlusUserRoleVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusUserRoleVO>(ApiPaths.BackendPath("/rbac/user/role/list"), body, query);
        }

        /// <summary>
        /// Get all user-role relationships
        /// </summary>
        public async Task<PlusApiResultListPlusUserRoleVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusUserRoleVO>(ApiPaths.BackendPath("/rbac/user/role/list/all"), body);
        }

        /// <summary>
        /// Get user-role relationship by ID
        /// </summary>
        public async Task<PlusApiResultPlusUserRoleVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusUserRoleVO>(ApiPaths.BackendPath($"/rbac/user/role/{id}"));
        }

        /// <summary>
        /// Delete user-role relationship
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/rbac/user/role/{id}"));
        }
    }
}
