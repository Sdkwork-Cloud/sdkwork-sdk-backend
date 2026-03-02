using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class RefundApi
    {
        private readonly HttpClient _client;

        public RefundApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing refund record
        /// </summary>
        public async Task<PlusApiResultPlusRefundVO?> UpdateAsync(PlusRefundForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusRefundVO>(ApiPaths.BackendPath("/trade/refund"), body);
        }

        /// <summary>
        /// Create a new refund record
        /// </summary>
        public async Task<PlusApiResultPlusRefundVO?> CreateAsync(PlusRefundForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusRefundVO>(ApiPaths.BackendPath("/trade/refund"), body);
        }

        /// <summary>
        /// Get refund records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusRefundVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusRefundVO>(ApiPaths.BackendPath("/trade/refund/list"), body, query);
        }

        /// <summary>
        /// Get all refund records
        /// </summary>
        public async Task<PlusApiResultListPlusRefundVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusRefundVO>(ApiPaths.BackendPath("/trade/refund/list/all"), body);
        }

        /// <summary>
        /// Get a refund record by ID
        /// </summary>
        public async Task<PlusApiResultPlusRefundVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusRefundVO>(ApiPaths.BackendPath($"/trade/refund/{id}"));
        }

        /// <summary>
        /// Delete a refund record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/trade/refund/{id}"));
        }
    }
}
