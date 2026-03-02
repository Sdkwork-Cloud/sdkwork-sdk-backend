using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ProjectApi
    {
        private readonly HttpClient _client;

        public ProjectApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing project
        /// </summary>
        public async Task<PlusApiResultPlusProjectVO?> UpdateAsync(PlusProjectForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusProjectVO>(ApiPaths.BackendPath("/project"), body);
        }

        /// <summary>
        /// Create a new project
        /// </summary>
        public async Task<PlusApiResultPlusProjectVO?> CreateAsync(PlusProjectForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusProjectVO>(ApiPaths.BackendPath("/project"), body);
        }

        /// <summary>
        /// Get projects by page
        /// </summary>
        public async Task<PlusApiResultPagePlusProjectVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusProjectVO>(ApiPaths.BackendPath("/project/list"), body, query);
        }

        /// <summary>
        /// Get all projects
        /// </summary>
        public async Task<PlusApiResultListPlusProjectVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusProjectVO>(ApiPaths.BackendPath("/project/list/all"), body);
        }

        /// <summary>
        /// Get a project by ID
        /// </summary>
        public async Task<PlusApiResultPlusProjectVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusProjectVO>(ApiPaths.BackendPath($"/project/{id}"));
        }

        /// <summary>
        /// Delete a project
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/project/{id}"));
        }
    }
}
