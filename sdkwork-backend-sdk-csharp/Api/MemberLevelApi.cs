using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class MemberLevelApi
    {
        private readonly HttpClient _client;

        public MemberLevelApi(HttpClient client)
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
        /// Get member levels by page
        /// </summary>
        public async Task<PlusApiResultPagePlusMemberLevelVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusMemberLevelVO>(ApiPaths.BackendPath("/member/level/list"), body, query);
        }

        /// <summary>
        /// Get all member levels
        /// </summary>
        public async Task<PlusApiResultListPlusMemberLevelVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusMemberLevelVO>(ApiPaths.BackendPath("/member/level/list/all"), body);
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
    }
}
