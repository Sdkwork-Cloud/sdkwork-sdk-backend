using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class PermissionApi
    {
        private readonly HttpClient _client;

        public PermissionApi(HttpClient client)
        {
            _client = client;
        }

        public async Task<PlusApiResultPlusPermissionVO?> UpdateAsync(PlusPermissionForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusPermissionVO>(ApiPaths.BackendPath("/permission"), body);
        }

        public async Task<PlusApiResultPlusPermissionVO?> CreateAsync(PlusPermissionForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusPermissionVO>(ApiPaths.BackendPath("/permission"), body);
        }

        /// <summary>
        /// List permissions by page
        /// </summary>
        public async Task<PlusApiResultPagePlusPermissionVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusPermissionVO>(ApiPaths.BackendPath("/permission/list"), body, query);
        }

        /// <summary>
        /// List all permissions
        /// </summary>
        public async Task<PlusApiResultListPlusPermissionVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusPermissionVO>(ApiPaths.BackendPath("/permission/list/all"), body);
        }

        public async Task<PlusApiResultPlusPermissionVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusPermissionVO>(ApiPaths.BackendPath($"/permission/{id}"));
        }

        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/permission/{id}"));
        }
    }
}
