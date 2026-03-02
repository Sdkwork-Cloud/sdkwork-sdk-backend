using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ShoppingCartItemApi
    {
        private readonly HttpClient _client;

        public ShoppingCartItemApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing shopping cart item
        /// </summary>
        public async Task<PlusApiResultPlusShoppingCartItemVO?> UpdateAsync(PlusShoppingCartItemForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusShoppingCartItemVO>(ApiPaths.BackendPath("/trade/shopping/cart/item"), body);
        }

        /// <summary>
        /// Create a new shopping cart item
        /// </summary>
        public async Task<PlusApiResultPlusShoppingCartItemVO?> CreateAsync(PlusShoppingCartItemForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusShoppingCartItemVO>(ApiPaths.BackendPath("/trade/shopping/cart/item"), body);
        }

        /// <summary>
        /// Get shopping cart items by page
        /// </summary>
        public async Task<PlusApiResultPagePlusShoppingCartItemVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusShoppingCartItemVO>(ApiPaths.BackendPath("/trade/shopping/cart/item/list"), body, query);
        }

        /// <summary>
        /// Get all shopping cart items
        /// </summary>
        public async Task<PlusApiResultListPlusShoppingCartItemVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusShoppingCartItemVO>(ApiPaths.BackendPath("/trade/shopping/cart/item/list/all"), body);
        }

        /// <summary>
        /// Get a shopping cart item by ID
        /// </summary>
        public async Task<PlusApiResultPlusShoppingCartItemVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusShoppingCartItemVO>(ApiPaths.BackendPath($"/trade/shopping/cart/item/{id}"));
        }

        /// <summary>
        /// Delete a shopping cart item
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/trade/shopping/cart/item/{id}"));
        }
    }
}
