using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AiAgentApi
    {
        private readonly HttpClient _client;

        public AiAgentApi(HttpClient client)
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
        /// Get public AI agents by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiAgentVO?> ListPublicAsync(PlusAiAgentQueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiAgentVO>(ApiPaths.BackendPath("/agent/list_public"), body, query);
        }

        /// <summary>
        /// Get AI agents by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiAgentVO?> ListByPageAsync(PlusAiAgentQueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiAgentVO>(ApiPaths.BackendPath("/agent/list"), body, query);
        }

        /// <summary>
        /// Get all AI agents
        /// </summary>
        public async Task<PlusApiResultListPlusAiAgentVO?> ListAllEntitiesAsync(PlusAiAgentQueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAiAgentVO>(ApiPaths.BackendPath("/agent/list/all"), body);
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
    }
}
