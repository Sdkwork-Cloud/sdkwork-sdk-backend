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
        /// Get accounts by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAccountVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAccountVO>(ApiPaths.BackendPath("/account/list"), body, query);
        }

        /// <summary>
        /// Get all accounts
        /// </summary>
        public async Task<PlusApiResultListPlusAccountVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAccountVO>(ApiPaths.BackendPath("/account/list/all"), body);
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
    }
}
