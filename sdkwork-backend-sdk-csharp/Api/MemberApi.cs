using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class MemberApi
    {
        private readonly HttpClient _client;

        public MemberApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing member level
        /// </summary>
        public async Task<PlusApiResultPlusMemberLevelVO?> UpdateAsync(PlusMemberLevelForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusMemberLevelVO>(ApiPaths.BackendPath("/member/level"), body);
        }

        /// <summary>
        /// Create a new member level
        /// </summary>
        public async Task<PlusApiResultPlusMemberLevelVO?> CreateAsync(PlusMemberLevelForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusMemberLevelVO>(ApiPaths.BackendPath("/member/level"), body);
        }

        /// <summary>
        /// Update an existing member card
        /// </summary>
        public async Task<PlusApiResultPlusMemberCardVO?> UpdateCardAsync(PlusMemberCardForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusMemberCardVO>(ApiPaths.BackendPath("/member/card"), body);
        }

        /// <summary>
        /// Create a new member card
        /// </summary>
        public async Task<PlusApiResultPlusMemberCardVO?> CreateCardAsync(PlusMemberCardForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusMemberCardVO>(ApiPaths.BackendPath("/member/card"), body);
        }

        /// <summary>
        /// Get member levels by page
        /// </summary>
        public async Task<PlusApiResultPagePlusMemberLevelVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusMemberLevelVO>(ApiPaths.BackendPath("/member/level/list"), body, query);
        }

        /// <summary>
        /// Get all member levels
        /// </summary>
        public async Task<PlusApiResultListPlusMemberLevelVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusMemberLevelVO>(ApiPaths.BackendPath("/member/level/list/all"), body);
        }

        /// <summary>
        /// Get member cards by page
        /// </summary>
        public async Task<PlusApiResultPagePlusMemberCardVO?> CreateListByPageCardAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusMemberCardVO>(ApiPaths.BackendPath("/member/card/list"), body, query);
        }

        /// <summary>
        /// Get all member cards
        /// </summary>
        public async Task<PlusApiResultListPlusMemberCardVO?> CreateListAllEntitiesCardAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusMemberCardVO>(ApiPaths.BackendPath("/member/card/list/all"), body);
        }

        /// <summary>
        /// Get a member level by ID
        /// </summary>
        public async Task<PlusApiResultPlusMemberLevelVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusMemberLevelVO>(ApiPaths.BackendPath($"/member/level/{id}"));
        }

        /// <summary>
        /// Delete a member level
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/member/level/{id}"));
        }

        /// <summary>
        /// Get a member card by ID
        /// </summary>
        public async Task<PlusApiResultPlusMemberCardVO?> GetByIdCardAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusMemberCardVO>(ApiPaths.BackendPath($"/member/card/{id}"));
        }

        /// <summary>
        /// Delete a member card
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteCardAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/member/card/{id}"));
        }
    }
}
