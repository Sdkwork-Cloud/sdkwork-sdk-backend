using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class SchemaApi
    {
        private readonly HttpClient _client;

        public SchemaApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing database schema
        /// </summary>
        public async Task<PlusApiResultPlusSchemaVO?> UpdateAsync(PlusSchemaForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusSchemaVO>(ApiPaths.BackendPath("/schema"), body);
        }

        /// <summary>
        /// Create a new database schema
        /// </summary>
        public async Task<PlusApiResultPlusSchemaVO?> CreateAsync(PlusSchemaForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusSchemaVO>(ApiPaths.BackendPath("/schema"), body);
        }

        /// <summary>
        /// Get database schemas by page
        /// </summary>
        public async Task<PlusApiResultPagePlusSchemaVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusSchemaVO>(ApiPaths.BackendPath("/schema/list"), body, query);
        }

        /// <summary>
        /// Get all database schemas
        /// </summary>
        public async Task<PlusApiResultListPlusSchemaVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusSchemaVO>(ApiPaths.BackendPath("/schema/list/all"), body);
        }

        /// <summary>
        /// Get a database schema by ID
        /// </summary>
        public async Task<PlusApiResultPlusSchemaVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusSchemaVO>(ApiPaths.BackendPath($"/schema/{id}"));
        }

        /// <summary>
        /// Delete a database schema
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/schema/{id}"));
        }
    }
}
