using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class DepartmentApi
    {
        private readonly HttpClient _client;

        public DepartmentApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing department
        /// </summary>
        public async Task<PlusApiResultPlusDepartmentVO?> UpdateAsync(PlusDepartmentForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusDepartmentVO>(ApiPaths.BackendPath("/department"), body);
        }

        /// <summary>
        /// Create a new department
        /// </summary>
        public async Task<PlusApiResultPlusDepartmentVO?> CreateAsync(PlusDepartmentForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusDepartmentVO>(ApiPaths.BackendPath("/department"), body);
        }

        /// <summary>
        /// Get departments by page
        /// </summary>
        public async Task<PlusApiResultPagePlusDepartmentVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusDepartmentVO>(ApiPaths.BackendPath("/department/list"), body, query);
        }

        /// <summary>
        /// Get all departments
        /// </summary>
        public async Task<PlusApiResultListPlusDepartmentVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusDepartmentVO>(ApiPaths.BackendPath("/department/list/all"), body);
        }

        /// <summary>
        /// Get a department by ID
        /// </summary>
        public async Task<PlusApiResultPlusDepartmentVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusDepartmentVO>(ApiPaths.BackendPath($"/department/{id}"));
        }

        /// <summary>
        /// Delete a department
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/department/{id}"));
        }
    }
}
