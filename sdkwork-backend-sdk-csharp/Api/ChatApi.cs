using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ChatApi
    {
        private readonly HttpClient _client;

        public ChatApi(HttpClient client)
        {
            _client = client;
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
        /// Stop a chat completion stream
        /// </summary>
        public async Task<PlusApiResult?> StopAsync(Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<PlusApiResult>(ApiPaths.BackendPath("/chat/stop"), null, query, headers);
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
        /// Create a chat completion
        /// </summary>
        public async Task<ChatCompletionChunk?> CreateAsync(ChatCompletionCreateForm body, Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/chat/completions"), body, query, headers);
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
