using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class TradeApi
    {
        private readonly HttpClient _client;

        public TradeApi(HttpClient client)
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
        /// Update an existing shopping cart item
        /// </summary>
        public async Task<PlusApiResultPlusShoppingCartItemVO?> UpdateItemAsync(PlusShoppingCartItemForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusShoppingCartItemVO>(ApiPaths.BackendPath("/trade/shopping/cart/item"), body);
        }

        /// <summary>
        /// Create a new shopping cart item
        /// </summary>
        public async Task<PlusApiResultPlusShoppingCartItemVO?> CreateItemAsync(PlusShoppingCartItemForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusShoppingCartItemVO>(ApiPaths.BackendPath("/trade/shopping/cart/item"), body);
        }

        /// <summary>
        /// Update an existing refund record
        /// </summary>
        public async Task<PlusApiResultPlusRefundVO?> UpdateRefundAsync(PlusRefundForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusRefundVO>(ApiPaths.BackendPath("/trade/refund"), body);
        }

        /// <summary>
        /// Create a new refund record
        /// </summary>
        public async Task<PlusApiResultPlusRefundVO?> CreateRefundAsync(PlusRefundForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusRefundVO>(ApiPaths.BackendPath("/trade/refund"), body);
        }

        /// <summary>
        /// Update an existing payment record
        /// </summary>
        public async Task<PlusApiResultPlusPaymentVO?> UpdatePaymentAsync(PlusPaymentForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusPaymentVO>(ApiPaths.BackendPath("/trade/payment"), body);
        }

        /// <summary>
        /// Create a new payment record
        /// </summary>
        public async Task<PlusApiResultPlusPaymentVO?> CreatePaymentAsync(PlusPaymentForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusPaymentVO>(ApiPaths.BackendPath("/trade/payment"), body);
        }

        /// <summary>
        /// Update an existing order
        /// </summary>
        public async Task<PlusApiResultPlusOrderVO?> UpdateOrderAsync(PlusOrderForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusOrderVO>(ApiPaths.BackendPath("/trade/order"), body);
        }

        /// <summary>
        /// Create a new order
        /// </summary>
        public async Task<PlusApiResultPlusOrderVO?> CreateOrderAsync(PlusOrderForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusOrderVO>(ApiPaths.BackendPath("/trade/order"), body);
        }

        /// <summary>
        /// Update worker dispatch profile
        /// </summary>
        public async Task<PlusApiResultPlusOrderWorkerDispatchProfileVO?> UpdateWorkerDispatchProfileAsync(PlusOrderWorkerDispatchProfileForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusOrderWorkerDispatchProfileVO>(ApiPaths.BackendPath("/trade/order/worker-dispatch-profile"), body);
        }

        /// <summary>
        /// Create worker dispatch profile
        /// </summary>
        public async Task<PlusApiResultPlusOrderWorkerDispatchProfileVO?> CreateWorkerDispatchProfileAsync(PlusOrderWorkerDispatchProfileForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusOrderWorkerDispatchProfileVO>(ApiPaths.BackendPath("/trade/order/worker-dispatch-profile"), body);
        }

        /// <summary>
        /// Update an existing order item
        /// </summary>
        public async Task<PlusApiResultPlusOrderItemVO?> UpdateItem2Async(PlusOrderItemForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusOrderItemVO>(ApiPaths.BackendPath("/trade/order/item"), body);
        }

        /// <summary>
        /// Create a new order item
        /// </summary>
        public async Task<PlusApiResultPlusOrderItemVO?> CreateItem2Async(PlusOrderItemForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusOrderItemVO>(ApiPaths.BackendPath("/trade/order/item"), body);
        }

        /// <summary>
        /// Update dispatch rule
        /// </summary>
        public async Task<PlusApiResultPlusOrderDispatchRuleVO?> UpdateDispatchRuleAsync(PlusOrderDispatchRuleForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusOrderDispatchRuleVO>(ApiPaths.BackendPath("/trade/order/dispatch-rule"), body);
        }

        /// <summary>
        /// Create dispatch rule
        /// </summary>
        public async Task<PlusApiResultPlusOrderDispatchRuleVO?> CreateDispatchRuleAsync(PlusOrderDispatchRuleForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusOrderDispatchRuleVO>(ApiPaths.BackendPath("/trade/order/dispatch-rule"), body);
        }

        /// <summary>
        /// Get shopping carts by page
        /// </summary>
        public async Task<PlusApiResultPagePlusShoppingCartVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusShoppingCartVO>(ApiPaths.BackendPath("/trade/shopping/cart/list"), body, query);
        }

        /// <summary>
        /// Get all shopping carts
        /// </summary>
        public async Task<PlusApiResultListPlusShoppingCartVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusShoppingCartVO>(ApiPaths.BackendPath("/trade/shopping/cart/list/all"), body);
        }

        /// <summary>
        /// Get shopping cart items by page
        /// </summary>
        public async Task<PlusApiResultPagePlusShoppingCartItemVO?> CreateListByPageItemAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusShoppingCartItemVO>(ApiPaths.BackendPath("/trade/shopping/cart/item/list"), body, query);
        }

        /// <summary>
        /// Get all shopping cart items
        /// </summary>
        public async Task<PlusApiResultListPlusShoppingCartItemVO?> CreateListAllEntitiesItemAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusShoppingCartItemVO>(ApiPaths.BackendPath("/trade/shopping/cart/item/list/all"), body);
        }

        /// <summary>
        /// Get refund records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusRefundVO?> CreateListByPageRefundAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusRefundVO>(ApiPaths.BackendPath("/trade/refund/list"), body, query);
        }

        /// <summary>
        /// Get all refund records
        /// </summary>
        public async Task<PlusApiResultListPlusRefundVO?> CreateListAllEntitiesRefundAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusRefundVO>(ApiPaths.BackendPath("/trade/refund/list/all"), body);
        }

        /// <summary>
        /// Check payment status
        /// </summary>
        public async Task<PlusApiResultBoolean?> CheckPaymentStatusAsync(PlusPaymentStatusQueryForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/trade/payment/status"), body);
        }

        /// <summary>
        /// Refund payment
        /// </summary>
        public async Task<PlusApiResultBoolean?> RefundPaymentAsync(PlusRefundForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/trade/payment/refund"), body);
        }

        /// <summary>
        /// Get payment records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusPaymentVO?> CreateListByPagePaymentAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusPaymentVO>(ApiPaths.BackendPath("/trade/payment/list"), body, query);
        }

        /// <summary>
        /// Get all payment records
        /// </summary>
        public async Task<PlusApiResultListPlusPaymentVO?> CreateListAllEntitiesPaymentAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusPaymentVO>(ApiPaths.BackendPath("/trade/payment/list/all"), body);
        }

        /// <summary>
        /// Cancel payment
        /// </summary>
        public async Task<PlusApiResultBoolean?> CancelPaymentAsync(PlusPaymentCancelForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/trade/payment/cancel"), body);
        }

        /// <summary>
        /// Ship an order
        /// </summary>
        public async Task<PlusApiResultOrderShipVO?> ShipOrderAsync(string id, string? body = null)
        {
            return await _client.PostAsync<PlusApiResultOrderShipVO>(ApiPaths.BackendPath($"/trade/order/{id}/ship"), body);
        }

        /// <summary>
        /// Start service order
        /// </summary>
        public async Task<PlusApiResultServiceOrderVO?> StartServiceOrderAsync(string id, OrderDispatchActionForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultServiceOrderVO>(ApiPaths.BackendPath($"/trade/order/{id}/dispatch/start"), body);
        }

        /// <summary>
        /// Release service order
        /// </summary>
        public async Task<PlusApiResultServiceOrderVO?> ReleaseServiceOrderAsync(string id, OrderDispatchActionForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultServiceOrderVO>(ApiPaths.BackendPath($"/trade/order/{id}/dispatch/release"), body);
        }

        /// <summary>
        /// Complete service order
        /// </summary>
        public async Task<PlusApiResultServiceOrderVO?> CompleteServiceOrderAsync(string id, OrderDispatchActionForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultServiceOrderVO>(ApiPaths.BackendPath($"/trade/order/{id}/dispatch/complete"), body);
        }

        /// <summary>
        /// Claim service order
        /// </summary>
        public async Task<PlusApiResultServiceOrderVO?> ClaimServiceOrderAsync(string id, OrderDispatchActionForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultServiceOrderVO>(ApiPaths.BackendPath($"/trade/order/{id}/dispatch/claim"), body);
        }

        /// <summary>
        /// Assign service order
        /// </summary>
        public async Task<PlusApiResultServiceOrderVO?> AssignServiceOrderAsync(string id, OrderDispatchAssignForm body)
        {
            return await _client.PostAsync<PlusApiResultServiceOrderVO>(ApiPaths.BackendPath($"/trade/order/{id}/dispatch/assign"), body);
        }

        /// <summary>
        /// Confirm an order
        /// </summary>
        public async Task<PlusApiResultOrderConfirmVO?> ConfirmOrderAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultOrderConfirmVO>(ApiPaths.BackendPath($"/trade/order/{id}/confirm"), null);
        }

        /// <summary>
        /// Complete an order
        /// </summary>
        public async Task<PlusApiResultOrderCompleteVO?> CompleteOrderAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultOrderCompleteVO>(ApiPaths.BackendPath($"/trade/order/{id}/complete"), null);
        }

        /// <summary>
        /// Close an order
        /// </summary>
        public async Task<PlusApiResultOrderCloseVO?> CloseOrderAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultOrderCloseVO>(ApiPaths.BackendPath($"/trade/order/{id}/close"), null);
        }

        /// <summary>
        /// Cancel an order
        /// </summary>
        public async Task<PlusApiResultOrderCancelVO?> CancelOrderAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultOrderCancelVO>(ApiPaths.BackendPath($"/trade/order/{id}/cancel"), null);
        }

        /// <summary>
        /// List worker dispatch profiles by page
        /// </summary>
        public async Task<PlusApiResultPagePlusOrderWorkerDispatchProfileVO?> CreateListByPageWorkerDispatchProfileAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusOrderWorkerDispatchProfileVO>(ApiPaths.BackendPath("/trade/order/worker-dispatch-profile/list"), body, query);
        }

        /// <summary>
        /// List all worker dispatch profiles
        /// </summary>
        public async Task<PlusApiResultListPlusOrderWorkerDispatchProfileVO?> CreateListAllEntitiesWorkerDispatchProfileAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusOrderWorkerDispatchProfileVO>(ApiPaths.BackendPath("/trade/order/worker-dispatch-profile/list/all"), body);
        }

        /// <summary>
        /// Create virtual order
        /// </summary>
        public async Task<PlusApiResultVirtualOrderVO?> CreateVirtualOrderAsync(CreateVirtualOrderForm body)
        {
            return await _client.PostAsync<PlusApiResultVirtualOrderVO>(ApiPaths.BackendPath("/trade/order/virtual"), body);
        }

        /// <summary>
        /// Create VIP order
        /// </summary>
        public async Task<PlusApiResultVipOrderVO?> CreateVipOrderAsync(CreateVipOrderForm body)
        {
            return await _client.PostAsync<PlusApiResultVipOrderVO>(ApiPaths.BackendPath("/trade/order/vip"), body);
        }

        /// <summary>
        /// Create service order
        /// </summary>
        public async Task<PlusApiResultServiceOrderVO?> CreateServiceOrderAsync(CreateServiceOrderForm body)
        {
            return await _client.PostAsync<PlusApiResultServiceOrderVO>(ApiPaths.BackendPath("/trade/order/service"), body);
        }

        /// <summary>
        /// Create points order
        /// </summary>
        public async Task<PlusApiResultPointsOrderVO?> CreatePointsOrderAsync(CreatePointsOrderForm body)
        {
            return await _client.PostAsync<PlusApiResultPointsOrderVO>(ApiPaths.BackendPath("/trade/order/points"), body);
        }

        /// <summary>
        /// Get orders by page
        /// </summary>
        public async Task<PlusApiResultPagePlusOrderVO?> CreateListByPageOrderAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusOrderVO>(ApiPaths.BackendPath("/trade/order/list"), body, query);
        }

        /// <summary>
        /// Get all orders
        /// </summary>
        public async Task<PlusApiResultListPlusOrderVO?> CreateListAllEntitiesOrderAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusOrderVO>(ApiPaths.BackendPath("/trade/order/list/all"), body);
        }

        /// <summary>
        /// Get order items by page
        /// </summary>
        public async Task<PlusApiResultPagePlusOrderItemVO?> CreateListByPageItem2Async(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusOrderItemVO>(ApiPaths.BackendPath("/trade/order/item/list"), body, query);
        }

        /// <summary>
        /// Get all order items
        /// </summary>
        public async Task<PlusApiResultListPlusOrderItemVO?> CreateListAllEntitiesItem2Async(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusOrderItemVO>(ApiPaths.BackendPath("/trade/order/item/list/all"), body);
        }

        /// <summary>
        /// Create IM group order
        /// </summary>
        public async Task<PlusApiResultImGroupOrderVO?> CreateImGroupOrderAsync(CreateImGroupOrderForm body)
        {
            return await _client.PostAsync<PlusApiResultImGroupOrderVO>(ApiPaths.BackendPath("/trade/order/im_group"), body);
        }

        /// <summary>
        /// Create goods order
        /// </summary>
        public async Task<PlusApiResultGoodsOrderVO?> CreateGoodsOrderAsync(CreateGoodsOrderForm body)
        {
            return await _client.PostAsync<PlusApiResultGoodsOrderVO>(ApiPaths.BackendPath("/trade/order/goods"), body);
        }

        /// <summary>
        /// List dispatch rules by page
        /// </summary>
        public async Task<PlusApiResultPagePlusOrderDispatchRuleVO?> CreateListByPageDispatchRuleAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusOrderDispatchRuleVO>(ApiPaths.BackendPath("/trade/order/dispatch-rule/list"), body, query);
        }

        /// <summary>
        /// List all dispatch rules
        /// </summary>
        public async Task<PlusApiResultListPlusOrderDispatchRuleVO?> CreateListAllEntitiesDispatchRuleAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusOrderDispatchRuleVO>(ApiPaths.BackendPath("/trade/order/dispatch-rule/list/all"), body);
        }

        /// <summary>
        /// Create booking order
        /// </summary>
        public async Task<PlusApiResultBookingOrderVO?> CreateBookingOrderAsync(CreateBookingOrderForm body)
        {
            return await _client.PostAsync<PlusApiResultBookingOrderVO>(ApiPaths.BackendPath("/trade/order/booking"), body);
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

        /// <summary>
        /// Get a shopping cart item by ID
        /// </summary>
        public async Task<PlusApiResultPlusShoppingCartItemVO?> GetByIdItemAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusShoppingCartItemVO>(ApiPaths.BackendPath($"/trade/shopping/cart/item/{id}"));
        }

        /// <summary>
        /// Delete a shopping cart item
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteItemAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/trade/shopping/cart/item/{id}"));
        }

        /// <summary>
        /// Get a refund record by ID
        /// </summary>
        public async Task<PlusApiResultPlusRefundVO?> GetByIdRefundAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusRefundVO>(ApiPaths.BackendPath($"/trade/refund/{id}"));
        }

        /// <summary>
        /// Delete a refund record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteRefundAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/trade/refund/{id}"));
        }

        /// <summary>
        /// Get a payment record by ID
        /// </summary>
        public async Task<PlusApiResultPlusPaymentVO?> GetByIdPaymentAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusPaymentVO>(ApiPaths.BackendPath($"/trade/payment/{id}"));
        }

        /// <summary>
        /// Delete a payment record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeletePaymentAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/trade/payment/{id}"));
        }

        /// <summary>
        /// Get an order by ID
        /// </summary>
        public async Task<PlusApiResultPlusOrderVO?> GetByIdOrderAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusOrderVO>(ApiPaths.BackendPath($"/trade/order/{id}"));
        }

        /// <summary>
        /// Delete an order
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteOrderAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/trade/order/{id}"));
        }

        /// <summary>
        /// Get worker dispatch profile by id
        /// </summary>
        public async Task<PlusApiResultPlusOrderWorkerDispatchProfileVO?> GetByIdWorkerDispatchProfileAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusOrderWorkerDispatchProfileVO>(ApiPaths.BackendPath($"/trade/order/worker-dispatch-profile/{id}"));
        }

        /// <summary>
        /// Delete worker dispatch profile
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteWorkerDispatchProfileAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/trade/order/worker-dispatch-profile/{id}"));
        }

        /// <summary>
        /// Get an order item by ID
        /// </summary>
        public async Task<PlusApiResultPlusOrderItemVO?> GetByIdItem2Async(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusOrderItemVO>(ApiPaths.BackendPath($"/trade/order/item/{id}"));
        }

        /// <summary>
        /// Delete an order item
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteItem2Async(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/trade/order/item/{id}"));
        }

        /// <summary>
        /// Get dispatch rule by id
        /// </summary>
        public async Task<PlusApiResultPlusOrderDispatchRuleVO?> GetByIdDispatchRuleAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusOrderDispatchRuleVO>(ApiPaths.BackendPath($"/trade/order/dispatch-rule/{id}"));
        }

        /// <summary>
        /// Delete dispatch rule
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteDispatchRuleAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/trade/order/dispatch-rule/{id}"));
        }
    }
}
