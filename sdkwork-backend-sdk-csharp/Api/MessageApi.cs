using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class MessageApi
    {
        private readonly HttpClient _client;

        public MessageApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing chat message
        /// </summary>
        public async Task<PlusApiResultPlusChatMessageContentVO?> UpdateAsync(PlusChatMessageContentForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusChatMessageContentVO>(ApiPaths.BackendPath("/message"), body);
        }

        /// <summary>
        /// Create a new chat message
        /// </summary>
        public async Task<PlusApiResultPlusChatMessageContentVO?> CreateAsync(PlusChatMessageContentForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusChatMessageContentVO>(ApiPaths.BackendPath("/message"), body);
        }

        /// <summary>
        /// Get chat messages by page
        /// </summary>
        public async Task<PlusApiResultPagePlusChatMessageContentVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusChatMessageContentVO>(ApiPaths.BackendPath("/message/list"), body, query);
        }

        /// <summary>
        /// Get all chat messages
        /// </summary>
        public async Task<PlusApiResultListPlusChatMessageContentVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChatMessageContentVO>(ApiPaths.BackendPath("/message/list/all"), body);
        }

        /// <summary>
        /// Get chat message by ID
        /// </summary>
        public async Task<PlusApiResultPlusChatMessageContentVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusChatMessageContentVO>(ApiPaths.BackendPath($"/message/{id}"));
        }

        /// <summary>
        /// Delete a chat message
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/message/{id}"));
        }
    }
}
