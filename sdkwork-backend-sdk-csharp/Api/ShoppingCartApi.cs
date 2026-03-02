using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ShoppingCartApi
    {
        private readonly HttpClient _client;

        public ShoppingCartApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update shopping cart
        /// </summary>
        public async Task<PlusApiResultPlusShoppingCartVO?> UpdateAsync(PlusShoppingCartForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusShoppingCartVO>(ApiPaths.BackendPath("/trade/shopping/cart"), body);
        }

        /// <summary>
        /// Create shopping cart
        /// </summary>
        public async Task<PlusApiResultPlusShoppingCartVO?> CreateAsync(PlusShoppingCartForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusShoppingCartVO>(ApiPaths.BackendPath("/trade/shopping/cart"), body);
        }

        /// <summary>
        /// Get shopping carts by page
        /// </summary>
        public async Task<PlusApiResultPagePlusShoppingCartVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusShoppingCartVO>(ApiPaths.BackendPath("/trade/shopping/cart/list"), body, query);
        }

        /// <summary>
        /// Get all shopping carts
        /// </summary>
        public async Task<PlusApiResultListPlusShoppingCartVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusShoppingCartVO>(ApiPaths.BackendPath("/trade/shopping/cart/list/all"), body);
        }

        /// <summary>
        /// Get shopping cart by ID
        /// </summary>
        public async Task<PlusApiResultPlusShoppingCartVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusShoppingCartVO>(ApiPaths.BackendPath($"/trade/shopping/cart/{id}"));
        }

        /// <summary>
        /// Delete shopping cart
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/trade/shopping/cart/{id}"));
        }
    }
}
