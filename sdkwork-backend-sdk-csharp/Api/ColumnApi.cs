using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ColumnApi
    {
        private readonly HttpClient _client;

        public ColumnApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update column
        /// </summary>
        public async Task<PlusApiResultPlusColumnVO?> UpdateAsync(PlusColumnForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusColumnVO>(ApiPaths.BackendPath("/column"), body);
        }

        /// <summary>
        /// Create column
        /// </summary>
        public async Task<PlusApiResultPlusColumnVO?> CreateAsync(PlusColumnForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusColumnVO>(ApiPaths.BackendPath("/column"), body);
        }

        /// <summary>
        /// Get columns by page
        /// </summary>
        public async Task<PlusApiResultPagePlusColumnVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusColumnVO>(ApiPaths.BackendPath("/column/list"), body, query);
        }

        /// <summary>
        /// Get all columns
        /// </summary>
        public async Task<PlusApiResultListPlusColumnVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusColumnVO>(ApiPaths.BackendPath("/column/list/all"), body);
        }

        /// <summary>
        /// Get column by ID
        /// </summary>
        public async Task<PlusApiResultPlusColumnVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusColumnVO>(ApiPaths.BackendPath($"/column/{id}"));
        }

        /// <summary>
        /// Delete column
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/column/{id}"));
        }
    }
}
