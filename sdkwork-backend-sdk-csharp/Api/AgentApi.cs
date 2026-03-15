using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AgentApi
    {
        private readonly HttpClient _client;

        public AgentApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing AI agent
        /// </summary>
        public async Task<PlusApiResultPlusAiAgentVO?> UpdateAsync(PlusAiAgentForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAiAgentVO>(ApiPaths.BackendPath("/agent"), body);
        }

        /// <summary>
        /// Create a new AI agent
        /// </summary>
        public async Task<PlusApiResultPlusAiAgentVO?> CreateAsync(PlusAiAgentForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAiAgentVO>(ApiPaths.BackendPath("/agent"), body);
        }

        /// <summary>
        /// Update an existing agent-tool relationship
        /// </summary>
        public async Task<PlusApiResultPlusAiAgentToolVO?> UpdateToolAsync(PlusAiAgentToolForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAiAgentToolVO>(ApiPaths.BackendPath("/agent/tool"), body);
        }

        /// <summary>
        /// Create a new agent-tool relationship
        /// </summary>
        public async Task<PlusApiResultPlusAiAgentToolVO?> CreateToolAsync(PlusAiAgentToolForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAiAgentToolVO>(ApiPaths.BackendPath("/agent/tool"), body);
        }

        /// <summary>
        /// Get agent-tool relationships by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiAgentToolVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiAgentToolVO>(ApiPaths.BackendPath("/agent/tool/list"), body, query);
        }

        /// <summary>
        /// Get all agent-tool relationships
        /// </summary>
        public async Task<PlusApiResultListPlusAiAgentToolVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAiAgentToolVO>(ApiPaths.BackendPath("/agent/tool/list/all"), body);
        }

        /// <summary>
        /// Get public AI agents by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiAgentVO?> ListPublicAsync(PlusAiAgentQueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiAgentVO>(ApiPaths.BackendPath("/agent/list_public"), body, query);
        }

        /// <summary>
        /// Get AI agents by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiAgentVO?> CreateListByPageAgentAsync(PlusAiAgentQueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiAgentVO>(ApiPaths.BackendPath("/agent/list"), body, query);
        }

        /// <summary>
        /// Get all AI agents
        /// </summary>
        public async Task<PlusApiResultListPlusAiAgentVO?> CreateListAllEntitiesAgentAsync(PlusAiAgentQueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAiAgentVO>(ApiPaths.BackendPath("/agent/list/all"), body);
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
        public async Task<ChatCompletionChunk?> CreateCompletionsAsync(ChatCompletionCreateForm body, Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/agent/chat/completions"), body, query, headers);
        }

        /// <summary>
        /// Get an AI agent by ID
        /// </summary>
        public async Task<PlusApiResultPlusAiAgentVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAiAgentVO>(ApiPaths.BackendPath($"/agent/{id}"));
        }

        /// <summary>
        /// Delete an AI agent
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/agent/{id}"));
        }

        /// <summary>
        /// Get an agent-tool relationship by ID
        /// </summary>
        public async Task<PlusApiResultPlusAiAgentToolVO?> GetByIdToolAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAiAgentToolVO>(ApiPaths.BackendPath($"/agent/tool/{id}"));
        }

        /// <summary>
        /// Delete an agent-tool relationship
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteToolAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/agent/tool/{id}"));
        }
    }
}
