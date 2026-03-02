using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ChatMessageApi
    {
        private readonly HttpClient _client;

        public ChatMessageApi(HttpClient client)
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
        /// Update an existing chat message
        /// </summary>
        public async Task<PlusApiResultPlusChatMessageVO?> UpdateMessageAsync(PlusChatMessageForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusChatMessageVO>(ApiPaths.BackendPath("/chat/message"), body);
        }

        /// <summary>
        /// Create a new chat message
        /// </summary>
        public async Task<PlusApiResultPlusChatMessageVO?> CreateMessageAsync(PlusChatMessageForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusChatMessageVO>(ApiPaths.BackendPath("/chat/message"), body);
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
        /// Get chat messages by page
        /// </summary>
        public async Task<PlusApiResultPagePlusChatMessageVO?> LoadMoreAsync(ChatMessageQueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusChatMessageVO>(ApiPaths.BackendPath("/chat/message/load_more"), body, query);
        }

        /// <summary>
        /// Get chat messages by page
        /// </summary>
        public async Task<PlusApiResultPagePlusChatMessageVO?> CreateListByPageAsync(ChatMessageQueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusChatMessageVO>(ApiPaths.BackendPath("/chat/message/list"), body, query);
        }

        /// <summary>
        /// Get all chat messages
        /// </summary>
        public async Task<PlusApiResultListPlusChatMessageVO?> CreateListAllEntitiesAsync(ChatMessageQueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChatMessageVO>(ApiPaths.BackendPath("/chat/message/list/all"), body);
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

        /// <summary>
        /// Get a chat message by ID
        /// </summary>
        public async Task<PlusApiResultPlusChatMessageVO?> GetByIdMessageAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusChatMessageVO>(ApiPaths.BackendPath($"/chat/message/{id}"));
        }

        /// <summary>
        /// Delete a chat message
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteMessageAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/chat/message/{id}"));
        }
    }
}
