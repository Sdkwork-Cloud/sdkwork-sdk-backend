using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class RoleApi
    {
        private readonly HttpClient _client;

        public RoleApi(HttpClient client)
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
        /// Update role-permission association
        /// </summary>
        public async Task<PlusApiResultPlusRolePermissionVO?> UpdatePermissionAsync(PlusRolePermissionForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusRolePermissionVO>(ApiPaths.BackendPath("/role/permission"), body);
        }

        /// <summary>
        /// Create role-permission association
        /// </summary>
        public async Task<PlusApiResultPlusRolePermissionVO?> CreatePermissionAsync(PlusRolePermissionForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusRolePermissionVO>(ApiPaths.BackendPath("/role/permission"), body);
        }

        /// <summary>
        /// Get role-permission associations by page
        /// </summary>
        public async Task<PlusApiResultPagePlusRolePermissionVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusRolePermissionVO>(ApiPaths.BackendPath("/role/permission/list"), body, query);
        }

        /// <summary>
        /// Get all role-permission associations
        /// </summary>
        public async Task<PlusApiResultListPlusRolePermissionVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusRolePermissionVO>(ApiPaths.BackendPath("/role/permission/list/all"), body);
        }

        /// <summary>
        /// Get system roles by page
        /// </summary>
        public async Task<PlusApiResultPagePlusRoleVO?> CreateListByPageRoleAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusRoleVO>(ApiPaths.BackendPath("/role/list"), body, query);
        }

        /// <summary>
        /// Get all system roles
        /// </summary>
        public async Task<PlusApiResultListPlusRoleVO?> CreateListAllEntitiesRoleAsync(QueryListForm? body = null)
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

        /// <summary>
        /// Get role-permission association by ID
        /// </summary>
        public async Task<PlusApiResultPlusRolePermissionVO?> GetByIdPermissionAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusRolePermissionVO>(ApiPaths.BackendPath($"/role/permission/{id}"));
        }

        /// <summary>
        /// Delete role-permission association
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeletePermissionAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/role/permission/{id}"));
        }
    }
}
