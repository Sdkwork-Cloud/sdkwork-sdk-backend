using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class CollectionApi
    {
        private readonly HttpClient _client;

        public CollectionApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing collection
        /// </summary>
        public async Task<PlusApiResultPlusCollectionVO?> UpdateAsync(PlusCollectionForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusCollectionVO>(ApiPaths.BackendPath("/collection"), body);
        }

        /// <summary>
        /// Create a new collection
        /// </summary>
        public async Task<PlusApiResultPlusCollectionVO?> CreateAsync(PlusCollectionForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusCollectionVO>(ApiPaths.BackendPath("/collection"), body);
        }

        /// <summary>
        /// Get collections by page
        /// </summary>
        public async Task<PlusApiResultPagePlusCollectionVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusCollectionVO>(ApiPaths.BackendPath("/collection/list"), body, query);
        }

        /// <summary>
        /// Get all collections
        /// </summary>
        public async Task<PlusApiResultListPlusCollectionVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusCollectionVO>(ApiPaths.BackendPath("/collection/list/all"), body);
        }

        /// <summary>
        /// Get a collection by ID
        /// </summary>
        public async Task<PlusApiResultPlusCollectionVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusCollectionVO>(ApiPaths.BackendPath($"/collection/{id}"));
        }

        /// <summary>
        /// Delete a collection
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/collection/{id}"));
        }
    }
}
