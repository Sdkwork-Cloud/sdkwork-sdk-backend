using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class KnowledgeBaseChatApi
    {
        private readonly HttpClient _client;

        public KnowledgeBaseChatApi(HttpClient client)
        {
            _client = client;
        }

        public async Task<PlusApiResultBoolean?> StopAsync(Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/knowledge_base/chat/stop"), null, null, headers);
        }

        /// <summary>
        /// Create a chat completion with Knowledge base
        /// </summary>
        public async Task<ChatCompletionChunk?> CreateAsync(ChatCompletionCreateForm body, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/knowledge_base/chat/completions"), body, null, headers);
        }
    }
}
