using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AgentChatApi
    {
        private readonly HttpClient _client;

        public AgentChatApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create a chat completion with agent
        /// </summary>
        public async Task<ChatCompletionChunk?> WithContextAsync(ChatCompletionCreateForm body, Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/agent/chat/with_context"), body, query, headers);
        }

        /// <summary>
        /// Stop a chat completion stream
        /// </summary>
        public async Task<PlusApiResult?> StopAsync(Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<PlusApiResult>(ApiPaths.BackendPath("/agent/chat/stop"), null, query, headers);
        }

        /// <summary>
        /// Create a chat completion with agent
        /// </summary>
        public async Task<ChatCompletionChunk?> ResumeStreamAsync(ChatCompletionCreateForm body, Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/agent/chat/resume_stream"), body, query, headers);
        }

        /// <summary>
        /// Create a chat completion with agent
        /// </summary>
        public async Task<ChatCompletionChunk?> CreateAsync(ChatCompletionCreateForm body, Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/agent/chat/completions"), body, query, headers);
        }
    }
}
