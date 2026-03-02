using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ShopApi
    {
        private readonly HttpClient _client;

        public ShopApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing shop
        /// </summary>
        public async Task<PlusApiResultPlusShopVO?> UpdateAsync(PlusShopForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusShopVO>(ApiPaths.BackendPath("/shop"), body);
        }

        /// <summary>
        /// Create a new shop
        /// </summary>
        public async Task<PlusApiResultPlusShopVO?> CreateAsync(PlusShopForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusShopVO>(ApiPaths.BackendPath("/shop"), body);
        }

        /// <summary>
        /// Get shops by page
        /// </summary>
        public async Task<PlusApiResultPagePlusShopVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusShopVO>(ApiPaths.BackendPath("/shop/list"), body, query);
        }

        /// <summary>
        /// Get all shops
        /// </summary>
        public async Task<PlusApiResultListPlusShopVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusShopVO>(ApiPaths.BackendPath("/shop/list/all"), body);
        }

        /// <summary>
        /// Get a shop by ID
        /// </summary>
        public async Task<PlusApiResultPlusShopVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusShopVO>(ApiPaths.BackendPath($"/shop/{id}"));
        }

        /// <summary>
        /// Delete a shop
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/shop/{id}"));
        }
    }
}
