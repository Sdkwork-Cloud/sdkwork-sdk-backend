using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ProductSkuApi
    {
        private readonly HttpClient _client;

        public ProductSkuApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing SKU
        /// </summary>
        public async Task<PlusApiResultPlusSkuVO?> UpdateAsync(PlusSkuForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusSkuVO>(ApiPaths.BackendPath("/sku"), body);
        }

        /// <summary>
        /// Create a new SKU
        /// </summary>
        public async Task<PlusApiResultPlusSkuVO?> CreateAsync(PlusSkuForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusSkuVO>(ApiPaths.BackendPath("/sku"), body);
        }

        /// <summary>
        /// Get SKUs by page
        /// </summary>
        public async Task<PlusApiResultPagePlusSkuVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusSkuVO>(ApiPaths.BackendPath("/sku/list"), body, query);
        }

        /// <summary>
        /// Get all SKUs
        /// </summary>
        public async Task<PlusApiResultListPlusSkuVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusSkuVO>(ApiPaths.BackendPath("/sku/list/all"), body);
        }

        /// <summary>
        /// Get an SKU by ID
        /// </summary>
        public async Task<PlusApiResultPlusSkuVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusSkuVO>(ApiPaths.BackendPath($"/sku/{id}"));
        }

        /// <summary>
        /// Delete an SKU
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/sku/{id}"));
        }
    }
}
