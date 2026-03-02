using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ChatGroupApi
    {
        private readonly HttpClient _client;

        public ChatGroupApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing chat group
        /// </summary>
        public async Task<PlusApiResultPlusImGroupVO?> UpdateAsync(PlusImGroupForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusImGroupVO>(ApiPaths.BackendPath("/im/group"), body);
        }

        /// <summary>
        /// Create a new chat group
        /// </summary>
        public async Task<PlusApiResultPlusImGroupVO?> CreateAsync(PlusImGroupForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusImGroupVO>(ApiPaths.BackendPath("/im/group"), body);
        }

        /// <summary>
        /// Get chat groups by page
        /// </summary>
        public async Task<PlusApiResultPagePlusImGroupVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusImGroupVO>(ApiPaths.BackendPath("/im/group/list"), body, query);
        }

        /// <summary>
        /// Get all chat groups
        /// </summary>
        public async Task<PlusApiResultListPlusImGroupVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusImGroupVO>(ApiPaths.BackendPath("/im/group/list/all"), body);
        }

        /// <summary>
        /// Get a chat group by ID
        /// </summary>
        public async Task<PlusApiResultPlusImGroupVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusImGroupVO>(ApiPaths.BackendPath($"/im/group/{id}"));
        }

        /// <summary>
        /// Delete a chat group
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/im/group/{id}"));
        }
    }
}
