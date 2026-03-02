using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AiAgentChatApi
    {
        private readonly HttpClient _client;

        public AiAgentChatApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create a chat completion with agent
        /// </summary>
        public async Task<ChatCompletionChunk?> WithContextAsync(ChatCompletionCreateForm body, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/agent/chat/with_context"), body, null, headers);
        }

        /// <summary>
        /// Stop a chat completion stream
        /// </summary>
        public async Task<PlusApiResult?> StopAsync(Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<PlusApiResult>(ApiPaths.BackendPath("/agent/chat/stop"), null, null, headers);
        }

        /// <summary>
        /// Create a chat completion with agent
        /// </summary>
        public async Task<ChatCompletionChunk?> ResumeStreamAsync(ChatCompletionCreateForm body, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/agent/chat/resume_stream"), body, null, headers);
        }

        /// <summary>
        /// Create a chat completion with agent
        /// </summary>
        public async Task<ChatCompletionChunk?> CreateAsync(ChatCompletionCreateForm body, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/agent/chat/completions"), body, null, headers);
        }
    }
}
