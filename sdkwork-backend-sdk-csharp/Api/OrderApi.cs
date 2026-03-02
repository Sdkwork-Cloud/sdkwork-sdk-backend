using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class OrderApi
    {
        private readonly HttpClient _client;

        public OrderApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing order
        /// </summary>
        public async Task<PlusApiResultPlusOrderVO?> UpdateAsync(PlusOrderForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusOrderVO>(ApiPaths.BackendPath("/trade/order"), body);
        }

        /// <summary>
        /// Create a new order
        /// </summary>
        public async Task<PlusApiResultPlusOrderVO?> CreateAsync(PlusOrderForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusOrderVO>(ApiPaths.BackendPath("/trade/order"), body);
        }

        /// <summary>
        /// Ship an order
        /// </summary>
        public async Task<PlusApiResultOrderShipVO?> ShipAsync(string id, string body)
        {
            return await _client.PostAsync<PlusApiResultOrderShipVO>(ApiPaths.BackendPath($"/trade/order/{id}/ship"), body);
        }

        /// <summary>
        /// Confirm an order
        /// </summary>
        public async Task<PlusApiResultOrderConfirmVO?> ConfirmAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultOrderConfirmVO>(ApiPaths.BackendPath($"/trade/order/{id}/confirm"), null);
        }

        /// <summary>
        /// Complete an order
        /// </summary>
        public async Task<PlusApiResultOrderCompleteVO?> CompleteAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultOrderCompleteVO>(ApiPaths.BackendPath($"/trade/order/{id}/complete"), null);
        }

        /// <summary>
        /// Close an order
        /// </summary>
        public async Task<PlusApiResultOrderCloseVO?> CloseAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultOrderCloseVO>(ApiPaths.BackendPath($"/trade/order/{id}/close"), null);
        }

        /// <summary>
        /// Cancel an order
        /// </summary>
        public async Task<PlusApiResultOrderCancelVO?> CancelAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultOrderCancelVO>(ApiPaths.BackendPath($"/trade/order/{id}/cancel"), null);
        }

        /// <summary>
        /// Create virtual order
        /// </summary>
        public async Task<PlusApiResultVirtualOrderVO?> CreateVirtualAsync(CreateVirtualOrderForm body)
        {
            return await _client.PostAsync<PlusApiResultVirtualOrderVO>(ApiPaths.BackendPath("/trade/order/virtual"), body);
        }

        /// <summary>
        /// Create VIP order
        /// </summary>
        public async Task<PlusApiResultVipOrderVO?> CreateVipAsync(CreateVipOrderForm body)
        {
            return await _client.PostAsync<PlusApiResultVipOrderVO>(ApiPaths.BackendPath("/trade/order/vip"), body);
        }

        /// <summary>
        /// Create points order
        /// </summary>
        public async Task<PlusApiResultPointsOrderVO?> CreatePointsAsync(CreatePointsOrderForm body)
        {
            return await _client.PostAsync<PlusApiResultPointsOrderVO>(ApiPaths.BackendPath("/trade/order/points"), body);
        }

        /// <summary>
        /// Get orders by page
        /// </summary>
        public async Task<PlusApiResultPagePlusOrderVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusOrderVO>(ApiPaths.BackendPath("/trade/order/list"), body, query);
        }

        /// <summary>
        /// Get all orders
        /// </summary>
        public async Task<PlusApiResultListPlusOrderVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusOrderVO>(ApiPaths.BackendPath("/trade/order/list/all"), body);
        }

        /// <summary>
        /// Create IM group order
        /// </summary>
        public async Task<PlusApiResultImGroupOrderVO?> CreateImGroupAsync(CreateImGroupOrderForm body)
        {
            return await _client.PostAsync<PlusApiResultImGroupOrderVO>(ApiPaths.BackendPath("/trade/order/im_group"), body);
        }

        /// <summary>
        /// Create goods order
        /// </summary>
        public async Task<PlusApiResultGoodsOrderVO?> CreateGoodsAsync(CreateGoodsOrderForm body)
        {
            return await _client.PostAsync<PlusApiResultGoodsOrderVO>(ApiPaths.BackendPath("/trade/order/goods"), body);
        }

        /// <summary>
        /// Get an order by ID
        /// </summary>
        public async Task<PlusApiResultPlusOrderVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusOrderVO>(ApiPaths.BackendPath($"/trade/order/{id}"));
        }

        /// <summary>
        /// Delete an order
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/trade/order/{id}"));
        }
    }
}
