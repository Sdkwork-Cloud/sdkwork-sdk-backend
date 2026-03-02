using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class OrderItemApi
    {
        private readonly HttpClient _client;

        public OrderItemApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing order item
        /// </summary>
        public async Task<PlusApiResultPlusOrderItemVO?> UpdateAsync(PlusOrderItemForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusOrderItemVO>(ApiPaths.BackendPath("/trade/order/item"), body);
        }

        /// <summary>
        /// Create a new order item
        /// </summary>
        public async Task<PlusApiResultPlusOrderItemVO?> CreateAsync(PlusOrderItemForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusOrderItemVO>(ApiPaths.BackendPath("/trade/order/item"), body);
        }

        /// <summary>
        /// Get order items by page
        /// </summary>
        public async Task<PlusApiResultPagePlusOrderItemVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusOrderItemVO>(ApiPaths.BackendPath("/trade/order/item/list"), body, query);
        }

        /// <summary>
        /// Get all order items
        /// </summary>
        public async Task<PlusApiResultListPlusOrderItemVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusOrderItemVO>(ApiPaths.BackendPath("/trade/order/item/list/all"), body);
        }

        /// <summary>
        /// Get an order item by ID
        /// </summary>
        public async Task<PlusApiResultPlusOrderItemVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusOrderItemVO>(ApiPaths.BackendPath($"/trade/order/item/{id}"));
        }

        /// <summary>
        /// Delete an order item
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/trade/order/item/{id}"));
        }
    }
}
