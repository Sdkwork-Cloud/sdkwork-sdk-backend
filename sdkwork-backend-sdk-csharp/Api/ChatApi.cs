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
        /// Stop a chat completion stream
        /// </summary>
        public async Task<PlusApiResult?> StopAsync(Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<PlusApiResult>(ApiPaths.BackendPath("/chat/stop"), null, query, headers);
        }

        /// <summary>
        /// Create a chat completion
        /// </summary>
        public async Task<ChatCompletionChunk?> CreateAsync(ChatCompletionCreateForm body, Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/chat/completions"), body, query, headers);
        }
    }
}
