using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class PositionApi
    {
        private readonly HttpClient _client;

        public PositionApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing position
        /// </summary>
        public async Task<PlusApiResultPlusPositionVO?> UpdateAsync(PlusPositionForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusPositionVO>(ApiPaths.BackendPath("/organization/position"), body);
        }

        /// <summary>
        /// Create a new position
        /// </summary>
        public async Task<PlusApiResultPlusPositionVO?> CreateAsync(PlusPositionForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusPositionVO>(ApiPaths.BackendPath("/organization/position"), body);
        }

        /// <summary>
        /// Get positions by page
        /// </summary>
        public async Task<PlusApiResultPagePlusPositionVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusPositionVO>(ApiPaths.BackendPath("/organization/position/list"), body, query);
        }

        /// <summary>
        /// Get all positions
        /// </summary>
        public async Task<PlusApiResultListPlusPositionVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusPositionVO>(ApiPaths.BackendPath("/organization/position/list/all"), body);
        }

        /// <summary>
        /// Get a position by ID
        /// </summary>
        public async Task<PlusApiResultPlusPositionVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusPositionVO>(ApiPaths.BackendPath($"/organization/position/{id}"));
        }

        /// <summary>
        /// Delete a position
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/organization/position/{id}"));
        }
    }
}
