using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class DatabaseTableApi
    {
        private readonly HttpClient _client;

        public DatabaseTableApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing database table
        /// </summary>
        public async Task<PlusApiResultPlusTableVO?> UpdateAsync(PlusTableForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusTableVO>(ApiPaths.BackendPath("/table"), body);
        }

        /// <summary>
        /// Create a new database table
        /// </summary>
        public async Task<PlusApiResultPlusTableVO?> CreateAsync(PlusTableForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusTableVO>(ApiPaths.BackendPath("/table"), body);
        }

        /// <summary>
        /// Get database tables by page
        /// </summary>
        public async Task<PlusApiResultPagePlusTableVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusTableVO>(ApiPaths.BackendPath("/table/list"), body, query);
        }

        /// <summary>
        /// Get all database tables
        /// </summary>
        public async Task<PlusApiResultListPlusTableVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusTableVO>(ApiPaths.BackendPath("/table/list/all"), body);
        }

        /// <summary>
        /// Get a database table by ID
        /// </summary>
        public async Task<PlusApiResultPlusTableVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusTableVO>(ApiPaths.BackendPath($"/table/{id}"));
        }

        /// <summary>
        /// Delete a database table
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/table/{id}"));
        }
    }
}
