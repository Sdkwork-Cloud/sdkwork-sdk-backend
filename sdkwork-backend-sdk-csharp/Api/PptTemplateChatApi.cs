using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class PptTemplateChatApi
    {
        private readonly HttpClient _client;

        public PptTemplateChatApi(HttpClient client)
        {
            _client = client;
        }

        public async Task<PlusApiResultBoolean?> StopAsync(Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/ppt/template/chat/stop"), null, query, headers);
        }

        /// <summary>
        /// Create a chat completion with PPT template
        /// </summary>
        public async Task<ChatCompletionChunk?> CreateAsync(ChatCompletionCreateForm body, Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/ppt/template/chat/completions"), body, query, headers);
        }
    }
}
