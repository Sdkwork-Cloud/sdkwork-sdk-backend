using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AgentToolRelationshipApi
    {
        private readonly HttpClient _client;

        public AgentToolRelationshipApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing agent-tool relationship
        /// </summary>
        public async Task<PlusApiResultPlusAiAgentToolVO?> UpdateAsync(PlusAiAgentToolForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAiAgentToolVO>(ApiPaths.BackendPath("/agent/tool"), body);
        }

        /// <summary>
        /// Create a new agent-tool relationship
        /// </summary>
        public async Task<PlusApiResultPlusAiAgentToolVO?> CreateAsync(PlusAiAgentToolForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAiAgentToolVO>(ApiPaths.BackendPath("/agent/tool"), body);
        }

        /// <summary>
        /// Get agent-tool relationships by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiAgentToolVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiAgentToolVO>(ApiPaths.BackendPath("/agent/tool/list"), body, query);
        }

        /// <summary>
        /// Get all agent-tool relationships
        /// </summary>
        public async Task<PlusApiResultListPlusAiAgentToolVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAiAgentToolVO>(ApiPaths.BackendPath("/agent/tool/list/all"), body);
        }

        /// <summary>
        /// Get an agent-tool relationship by ID
        /// </summary>
        public async Task<PlusApiResultPlusAiAgentToolVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAiAgentToolVO>(ApiPaths.BackendPath($"/agent/tool/{id}"));
        }

        /// <summary>
        /// Delete an agent-tool relationship
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/agent/tool/{id}"));
        }
    }
}
