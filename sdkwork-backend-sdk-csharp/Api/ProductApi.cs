using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ProductApi
    {
        private readonly HttpClient _client;

        public ProductApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing product
        /// </summary>
        public async Task<PlusApiResultPlusProductVO?> UpdateAsync(PlusProductForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusProductVO>(ApiPaths.BackendPath("/product"), body);
        }

        /// <summary>
        /// Create a new product
        /// </summary>
        public async Task<PlusApiResultPlusProductVO?> CreateAsync(PlusProductForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusProductVO>(ApiPaths.BackendPath("/product"), body);
        }

        /// <summary>
        /// Get all products
        /// </summary>
        public async Task<PlusApiResultPlusMallHomeVO?> MallHomeAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusMallHomeVO>(ApiPaths.BackendPath("/product/mall_home"), body);
        }

        /// <summary>
        /// Get products by page
        /// </summary>
        public async Task<PlusApiResultPagePlusProductVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusProductVO>(ApiPaths.BackendPath("/product/list"), body, query);
        }

        /// <summary>
        /// Get all products
        /// </summary>
        public async Task<PlusApiResultListPlusProductVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusProductVO>(ApiPaths.BackendPath("/product/list/all"), body);
        }

        /// <summary>
        /// Get a product by ID
        /// </summary>
        public async Task<PlusApiResultPlusProductVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusProductVO>(ApiPaths.BackendPath($"/product/{id}"));
        }

        /// <summary>
        /// Delete a product
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/product/{id}"));
        }

        /// <summary>
        /// Get a product by ID
        /// </summary>
        public async Task<PlusApiResultPlusProductVO?> GetDetailAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPlusProductVO>(ApiPaths.BackendPath("/product/detail"), query);
        }
    }
}
