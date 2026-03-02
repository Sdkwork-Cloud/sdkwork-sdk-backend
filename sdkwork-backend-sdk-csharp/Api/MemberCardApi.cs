using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class MemberCardApi
    {
        private readonly HttpClient _client;

        public MemberCardApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing member card
        /// </summary>
        public async Task<PlusApiResultPlusMemberCardVO?> UpdateAsync(PlusMemberCardForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusMemberCardVO>(ApiPaths.BackendPath("/member/card"), body);
        }

        /// <summary>
        /// Create a new member card
        /// </summary>
        public async Task<PlusApiResultPlusMemberCardVO?> CreateAsync(PlusMemberCardForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusMemberCardVO>(ApiPaths.BackendPath("/member/card"), body);
        }

        /// <summary>
        /// Get member cards by page
        /// </summary>
        public async Task<PlusApiResultPagePlusMemberCardVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusMemberCardVO>(ApiPaths.BackendPath("/member/card/list"), body, query);
        }

        /// <summary>
        /// Get all member cards
        /// </summary>
        public async Task<PlusApiResultListPlusMemberCardVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusMemberCardVO>(ApiPaths.BackendPath("/member/card/list/all"), body);
        }

        /// <summary>
        /// Get a member card by ID
        /// </summary>
        public async Task<PlusApiResultPlusMemberCardVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusMemberCardVO>(ApiPaths.BackendPath($"/member/card/{id}"));
        }

        /// <summary>
        /// Delete a member card
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/member/card/{id}"));
        }
    }
}
