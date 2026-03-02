using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class PaymentApi
    {
        private readonly HttpClient _client;

        public PaymentApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing payment record
        /// </summary>
        public async Task<PlusApiResultPlusPaymentVO?> UpdateAsync(PlusPaymentForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusPaymentVO>(ApiPaths.BackendPath("/trade/payment"), body);
        }

        /// <summary>
        /// Create a new payment record
        /// </summary>
        public async Task<PlusApiResultPlusPaymentVO?> CreateAsync(PlusPaymentForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusPaymentVO>(ApiPaths.BackendPath("/trade/payment"), body);
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
        public async Task<PlusApiResultBoolean?> RefundAsync(PlusRefundForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/trade/payment/refund"), body);
        }

        /// <summary>
        /// Get payment records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusPaymentVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusPaymentVO>(ApiPaths.BackendPath("/trade/payment/list"), body, query);
        }

        /// <summary>
        /// Get all payment records
        /// </summary>
        public async Task<PlusApiResultListPlusPaymentVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusPaymentVO>(ApiPaths.BackendPath("/trade/payment/list/all"), body);
        }

        /// <summary>
        /// Cancel payment
        /// </summary>
        public async Task<PlusApiResultBoolean?> CancelAsync(PlusPaymentCancelForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/trade/payment/cancel"), body);
        }

        /// <summary>
        /// Get a payment record by ID
        /// </summary>
        public async Task<PlusApiResultPlusPaymentVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusPaymentVO>(ApiPaths.BackendPath($"/trade/payment/{id}"));
        }

        /// <summary>
        /// Delete a payment record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/trade/payment/{id}"));
        }
    }
}
