using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AccountApi
    {
        private readonly HttpClient _client;

        public AccountApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing account
        /// </summary>
        public async Task<PlusApiResultPlusAccountVO?> UpdateAsync(PlusAccountForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAccountVO>(ApiPaths.BackendPath("/account"), body);
        }

        /// <summary>
        /// Create a new account
        /// </summary>
        public async Task<PlusApiResultPlusAccountVO?> CreateAsync(PlusAccountForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAccountVO>(ApiPaths.BackendPath("/account"), body);
        }

        /// <summary>
        /// Update an existing account history record
        /// </summary>
        public async Task<PlusApiResultPlusAccountHistoryVO?> UpdateHistoryAsync(PlusAccountHistoryForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAccountHistoryVO>(ApiPaths.BackendPath("/account/history"), body);
        }

        /// <summary>
        /// Create a new account history record
        /// </summary>
        public async Task<PlusApiResultPlusAccountHistoryVO?> CreateHistoryAsync(PlusAccountHistoryForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAccountHistoryVO>(ApiPaths.BackendPath("/account/history"), body);
        }

        /// <summary>
        /// Get points-to-cash rate
        /// </summary>
        public async Task<PlusApiResultAccountExchangeRateVO?> GetPointsToCashRateAsync()
        {
            return await _client.GetAsync<PlusApiResultAccountExchangeRateVO>(ApiPaths.BackendPath("/account/exchange-config/points-cash-rate"));
        }

        /// <summary>
        /// Update points-to-cash rate
        /// </summary>
        public async Task<PlusApiResultAccountExchangeRateVO?> UpdatePointsToCashRateAsync(AccountExchangeRateUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultAccountExchangeRateVO>(ApiPaths.BackendPath("/account/exchange-config/points-cash-rate"), body);
        }

        /// <summary>
        /// Get accounts by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAccountVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAccountVO>(ApiPaths.BackendPath("/account/list"), body, query);
        }

        /// <summary>
        /// Get all accounts
        /// </summary>
        public async Task<PlusApiResultListPlusAccountVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAccountVO>(ApiPaths.BackendPath("/account/list/all"), body);
        }

        /// <summary>
        /// Get account history records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAccountHistoryVO?> CreateListByPageHistoryAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAccountHistoryVO>(ApiPaths.BackendPath("/account/history/list"), body, query);
        }

        /// <summary>
        /// Get all account history records
        /// </summary>
        public async Task<PlusApiResultListPlusAccountHistoryVO?> CreateListAllEntitiesHistoryAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAccountHistoryVO>(ApiPaths.BackendPath("/account/history/list/all"), body);
        }

        /// <summary>
        /// Get points account
        /// </summary>
        public async Task<PlusApiResultPlusAccountVO?> GetPointsAsync(PlusGetAccountForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAccountVO>(ApiPaths.BackendPath("/account/get_points"), body);
        }

        /// <summary>
        /// Get cash account
        /// </summary>
        public async Task<PlusApiResultPlusAccountVO?> GetCashAsync(PlusGetAccountForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAccountVO>(ApiPaths.BackendPath("/account/get_cash"), body);
        }

        /// <summary>
        /// Get an account by ID
        /// </summary>
        public async Task<PlusApiResultPlusAccountVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAccountVO>(ApiPaths.BackendPath($"/account/{id}"));
        }

        /// <summary>
        /// Delete an account
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/account/{id}"));
        }

        /// <summary>
        /// Get an account history record by ID
        /// </summary>
        public async Task<PlusApiResultPlusAccountHistoryVO?> GetByIdHistoryAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAccountHistoryVO>(ApiPaths.BackendPath($"/account/history/{id}"));
        }

        /// <summary>
        /// Delete an account history record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteHistoryAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/account/history/{id}"));
        }
    }
}
