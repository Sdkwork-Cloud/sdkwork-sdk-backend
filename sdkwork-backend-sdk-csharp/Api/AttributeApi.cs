using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AttributeApi
    {
        private readonly HttpClient _client;

        public AttributeApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update attribute
        /// </summary>
        public async Task<PlusApiResultPlusAttributeVO?> UpdateAsync(PlusAttributeForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAttributeVO>(ApiPaths.BackendPath("/attribute"), body);
        }

        /// <summary>
        /// Create attribute
        /// </summary>
        public async Task<PlusApiResultPlusAttributeVO?> CreateAsync(PlusAttributeForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAttributeVO>(ApiPaths.BackendPath("/attribute"), body);
        }

        /// <summary>
        /// Get attributes by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAttributeVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAttributeVO>(ApiPaths.BackendPath("/attribute/list"), body, query);
        }

        /// <summary>
        /// Get all attributes
        /// </summary>
        public async Task<PlusApiResultListPlusAttributeVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAttributeVO>(ApiPaths.BackendPath("/attribute/list/all"), body);
        }

        /// <summary>
        /// Get attribute by ID
        /// </summary>
        public async Task<PlusApiResultPlusAttributeVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAttributeVO>(ApiPaths.BackendPath($"/attribute/{id}"));
        }

        /// <summary>
        /// Delete attribute
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/attribute/{id}"));
        }
    }
}
