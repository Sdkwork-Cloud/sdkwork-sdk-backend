using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AiChatApi
    {
        private readonly HttpClient _client;

        public AiChatApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Stop a chat completion stream
        /// </summary>
        public async Task<PlusApiResult?> StopAsync(Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<PlusApiResult>(ApiPaths.BackendPath("/chat/stop"), null, null, headers);
        }

        /// <summary>
        /// Create a chat completion
        /// </summary>
        public async Task<ChatCompletionChunk?> CreateAsync(ChatCompletionCreateForm body, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/chat/completions"), body, null, headers);
        }
    }
}
