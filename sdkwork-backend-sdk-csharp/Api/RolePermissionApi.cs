using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class RolePermissionApi
    {
        private readonly HttpClient _client;

        public RolePermissionApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update role-permission association
        /// </summary>
        public async Task<PlusApiResultPlusRolePermissionVO?> UpdateAsync(PlusRolePermissionForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusRolePermissionVO>(ApiPaths.BackendPath("/role/permission"), body);
        }

        /// <summary>
        /// Create role-permission association
        /// </summary>
        public async Task<PlusApiResultPlusRolePermissionVO?> CreateAsync(PlusRolePermissionForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusRolePermissionVO>(ApiPaths.BackendPath("/role/permission"), body);
        }

        /// <summary>
        /// Get role-permission associations by page
        /// </summary>
        public async Task<PlusApiResultPagePlusRolePermissionVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusRolePermissionVO>(ApiPaths.BackendPath("/role/permission/list"), body, query);
        }

        /// <summary>
        /// Get all role-permission associations
        /// </summary>
        public async Task<PlusApiResultListPlusRolePermissionVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusRolePermissionVO>(ApiPaths.BackendPath("/role/permission/list/all"), body);
        }

        /// <summary>
        /// Get role-permission association by ID
        /// </summary>
        public async Task<PlusApiResultPlusRolePermissionVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusRolePermissionVO>(ApiPaths.BackendPath($"/role/permission/{id}"));
        }

        /// <summary>
        /// Delete role-permission association
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/role/permission/{id}"));
        }
    }
}
