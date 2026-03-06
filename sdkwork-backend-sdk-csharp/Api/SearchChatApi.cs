using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class SearchChatApi
    {
        private readonly HttpClient _client;

        public SearchChatApi(HttpClient client)
        {
            _client = client;
        }

        public async Task<PlusApiResultBoolean?> StopAsync(Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/search/chat/stop"), null, query, headers);
        }

        /// <summary>
        /// Create a chat completion with Search
        /// </summary>
        public async Task<ChatCompletionChunk?> CreateAsync(ChatCompletionCreateForm body, Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/search/chat/completions"), body, query, headers);
        }
    }
}
