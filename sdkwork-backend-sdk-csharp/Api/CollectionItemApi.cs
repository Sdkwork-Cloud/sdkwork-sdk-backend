using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class CollectionItemApi
    {
        private readonly HttpClient _client;

        public CollectionItemApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing collection item
        /// </summary>
        public async Task<PlusApiResultPlusCollectionItemVO?> UpdateAsync(PlusCollectionItemForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusCollectionItemVO>(ApiPaths.BackendPath("/collection-item"), body);
        }

        /// <summary>
        /// Create a new collection item
        /// </summary>
        public async Task<PlusApiResultPlusCollectionItemVO?> CreateAsync(PlusCollectionItemForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusCollectionItemVO>(ApiPaths.BackendPath("/collection-item"), body);
        }

        /// <summary>
        /// Get collection items by page
        /// </summary>
        public async Task<PlusApiResultPagePlusCollectionItemVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusCollectionItemVO>(ApiPaths.BackendPath("/collection-item/list"), body, query);
        }

        /// <summary>
        /// Get all collection items
        /// </summary>
        public async Task<PlusApiResultListPlusCollectionItemVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusCollectionItemVO>(ApiPaths.BackendPath("/collection-item/list/all"), body);
        }

        /// <summary>
        /// Get a collection item by ID
        /// </summary>
        public async Task<PlusApiResultPlusCollectionItemVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusCollectionItemVO>(ApiPaths.BackendPath($"/collection-item/{id}"));
        }

        /// <summary>
        /// Delete a collection item
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/collection-item/{id}"));
        }
    }
}
