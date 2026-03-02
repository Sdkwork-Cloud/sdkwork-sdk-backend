using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class RbacRoleApi
    {
        private readonly HttpClient _client;

        public RbacRoleApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing system role
        /// </summary>
        public async Task<PlusApiResultPlusRoleVO?> UpdateAsync(PlusRoleForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusRoleVO>(ApiPaths.BackendPath("/role"), body);
        }

        /// <summary>
        /// Create a new system role
        /// </summary>
        public async Task<PlusApiResultPlusRoleVO?> CreateAsync(PlusRoleForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusRoleVO>(ApiPaths.BackendPath("/role"), body);
        }

        /// <summary>
        /// Get system roles by page
        /// </summary>
        public async Task<PlusApiResultPagePlusRoleVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusRoleVO>(ApiPaths.BackendPath("/role/list"), body, query);
        }

        /// <summary>
        /// Get all system roles
        /// </summary>
        public async Task<PlusApiResultListPlusRoleVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusRoleVO>(ApiPaths.BackendPath("/role/list/all"), body);
        }

        /// <summary>
        /// Get a system role by ID
        /// </summary>
        public async Task<PlusApiResultPlusRoleVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusRoleVO>(ApiPaths.BackendPath($"/role/{id}"));
        }

        /// <summary>
        /// Delete a system role
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/role/{id}"));
        }
    }
}
