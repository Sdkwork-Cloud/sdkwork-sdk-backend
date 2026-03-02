using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class MembershipCardApi
    {
        private readonly HttpClient _client;

        public MembershipCardApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing membership card
        /// </summary>
        public async Task<PlusApiResultPlusCardVO?> UpdateAsync(PlusCardForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusCardVO>(ApiPaths.BackendPath("/card"), body);
        }

        /// <summary>
        /// Create a new membership card
        /// </summary>
        public async Task<PlusApiResultPlusCardVO?> CreateAsync(PlusCardForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusCardVO>(ApiPaths.BackendPath("/card"), body);
        }

        /// <summary>
        /// Get membership cards by page
        /// </summary>
        public async Task<PlusApiResultPagePlusCardVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusCardVO>(ApiPaths.BackendPath("/card/list"), body, query);
        }

        /// <summary>
        /// Get all membership cards
        /// </summary>
        public async Task<PlusApiResultListPlusCardVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusCardVO>(ApiPaths.BackendPath("/card/list/all"), body);
        }

        /// <summary>
        /// Get a membership card by ID
        /// </summary>
        public async Task<PlusApiResultPlusCardVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusCardVO>(ApiPaths.BackendPath($"/card/{id}"));
        }

        /// <summary>
        /// Delete a membership card
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/card/{id}"));
        }
    }
}
