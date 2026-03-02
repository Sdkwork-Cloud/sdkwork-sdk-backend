using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AccountHistoryApi
    {
        private readonly HttpClient _client;

        public AccountHistoryApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing account history record
        /// </summary>
        public async Task<PlusApiResultPlusAccountHistoryVO?> UpdateAsync(PlusAccountHistoryForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAccountHistoryVO>(ApiPaths.BackendPath("/account/history"), body);
        }

        /// <summary>
        /// Create a new account history record
        /// </summary>
        public async Task<PlusApiResultPlusAccountHistoryVO?> CreateAsync(PlusAccountHistoryForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAccountHistoryVO>(ApiPaths.BackendPath("/account/history"), body);
        }

        /// <summary>
        /// Get account history records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAccountHistoryVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAccountHistoryVO>(ApiPaths.BackendPath("/account/history/list"), body, query);
        }

        /// <summary>
        /// Get all account history records
        /// </summary>
        public async Task<PlusApiResultListPlusAccountHistoryVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAccountHistoryVO>(ApiPaths.BackendPath("/account/history/list/all"), body);
        }

        /// <summary>
        /// Get an account history record by ID
        /// </summary>
        public async Task<PlusApiResultPlusAccountHistoryVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAccountHistoryVO>(ApiPaths.BackendPath($"/account/history/{id}"));
        }

        /// <summary>
        /// Delete an account history record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/account/history/{id}"));
        }
    }
}
