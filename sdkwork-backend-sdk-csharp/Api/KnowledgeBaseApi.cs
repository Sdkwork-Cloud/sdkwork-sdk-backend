using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class KnowledgeBaseApi
    {
        private readonly HttpClient _client;

        public KnowledgeBaseApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing knowledge base
        /// </summary>
        public async Task<PlusApiResultPlusKnowledgeBaseVO?> UpdateAsync(PlusKnowledgeBaseForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusKnowledgeBaseVO>(ApiPaths.BackendPath("/knowledge_base"), body);
        }

        /// <summary>
        /// Create a new knowledge base
        /// </summary>
        public async Task<PlusApiResultPlusKnowledgeBaseVO?> CreateAsync(PlusKnowledgeBaseForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusKnowledgeBaseVO>(ApiPaths.BackendPath("/knowledge_base"), body);
        }

        /// <summary>
        /// Get knowledge bases by page
        /// </summary>
        public async Task<PlusApiResultPagePlusKnowledgeBaseVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusKnowledgeBaseVO>(ApiPaths.BackendPath("/knowledge_base/list"), body, query);
        }

        /// <summary>
        /// Get all knowledge bases
        /// </summary>
        public async Task<PlusApiResultListPlusKnowledgeBaseVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusKnowledgeBaseVO>(ApiPaths.BackendPath("/knowledge_base/list/all"), body);
        }

        /// <summary>
        /// Get a knowledge base detail by ID
        /// </summary>
        public async Task<PlusApiResultPlusKnowledgeBaseVO?> GetDetailAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPlusKnowledgeBaseVO>(ApiPaths.BackendPath("/knowledge_base/get_detail"), null, query);
        }

        /// <summary>
        /// Get a knowledge base by ID
        /// </summary>
        public async Task<PlusApiResultPlusKnowledgeBaseVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusKnowledgeBaseVO>(ApiPaths.BackendPath($"/knowledge_base/{id}"));
        }

        /// <summary>
        /// Delete a knowledge base
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/knowledge_base/{id}"));
        }
    }
}
