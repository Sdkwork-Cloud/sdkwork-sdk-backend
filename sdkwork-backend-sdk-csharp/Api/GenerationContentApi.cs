using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class GenerationContentApi
    {
        private readonly HttpClient _client;

        public GenerationContentApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update AI generated content
        /// </summary>
        public async Task<PlusApiResultPlusAiGenerationContentVO?> UpdateAsync(PlusAiGenerationContentForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAiGenerationContentVO>(ApiPaths.BackendPath("/generation/content"), body);
        }

        /// <summary>
        /// Create new AI generated content
        /// </summary>
        public async Task<PlusApiResultPlusAiGenerationContentVO?> CreateAsync(PlusAiGenerationContentForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAiGenerationContentVO>(ApiPaths.BackendPath("/generation/content"), body);
        }

        /// <summary>
        /// Get AI generated content by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiGenerationContentVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiGenerationContentVO>(ApiPaths.BackendPath("/generation/content/list"), body, query);
        }

        /// <summary>
        /// Get all AI generated content
        /// </summary>
        public async Task<PlusApiResultListPlusAiGenerationContentVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAiGenerationContentVO>(ApiPaths.BackendPath("/generation/content/list/all"), body);
        }

        /// <summary>
        /// Get AI generated content by ID
        /// </summary>
        public async Task<PlusApiResultPlusAiGenerationContentVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAiGenerationContentVO>(ApiPaths.BackendPath($"/generation/content/{id}"));
        }

        /// <summary>
        /// Delete AI generated content
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/generation/content/{id}"));
        }
    }
}
