using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class WorkspaceApi
    {
        private readonly HttpClient _client;

        public WorkspaceApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing workspace
        /// </summary>
        public async Task<PlusApiResultPlusWorkspaceVO?> UpdateAsync(PlusWorkspaceForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusWorkspaceVO>(ApiPaths.BackendPath("/workspace"), body);
        }

        /// <summary>
        /// Create a new workspace
        /// </summary>
        public async Task<PlusApiResultPlusWorkspaceVO?> CreateAsync(PlusWorkspaceForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusWorkspaceVO>(ApiPaths.BackendPath("/workspace"), body);
        }

        /// <summary>
        /// Get workspaces by page
        /// </summary>
        public async Task<PlusApiResultPagePlusWorkspaceVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusWorkspaceVO>(ApiPaths.BackendPath("/workspace/list"), body, query);
        }

        /// <summary>
        /// Get all workspaces
        /// </summary>
        public async Task<PlusApiResultListPlusWorkspaceVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusWorkspaceVO>(ApiPaths.BackendPath("/workspace/list/all"), body);
        }

        /// <summary>
        /// Get a workspace by ID
        /// </summary>
        public async Task<PlusApiResultPlusWorkspaceVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusWorkspaceVO>(ApiPaths.BackendPath($"/workspace/{id}"));
        }

        /// <summary>
        /// Delete a workspace
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/workspace/{id}"));
        }
    }
}
