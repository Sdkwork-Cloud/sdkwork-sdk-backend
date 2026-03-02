using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AiGenerationApi
    {
        private readonly HttpClient _client;

        public AiGenerationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing AI generation record
        /// </summary>
        public async Task<PlusApiResultPlusAiGenerationVO?> UpdateAsync(PlusAiGenerationForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAiGenerationVO>(ApiPaths.BackendPath("/generation"), body);
        }

        /// <summary>
        /// Create a new AI generation record
        /// </summary>
        public async Task<PlusApiResultPlusAiGenerationVO?> CreateAsync(PlusAiGenerationForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAiGenerationVO>(ApiPaths.BackendPath("/generation"), body);
        }

        /// <summary>
        /// Get AI generation records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiGenerationVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiGenerationVO>(ApiPaths.BackendPath("/generation/list"), body, query);
        }

        /// <summary>
        /// Get all AI generation records
        /// </summary>
        public async Task<PlusApiResultListPlusAiGenerationVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAiGenerationVO>(ApiPaths.BackendPath("/generation/list/all"), body);
        }

        /// <summary>
        /// Get an AI generation record by ID
        /// </summary>
        public async Task<PlusApiResultPlusAiGenerationVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAiGenerationVO>(ApiPaths.BackendPath($"/generation/{id}"));
        }

        /// <summary>
        /// Delete an AI generation record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/generation/{id}"));
        }
    }
}
