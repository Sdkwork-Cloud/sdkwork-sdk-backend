using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class PromptApi
    {
        private readonly HttpClient _client;

        public PromptApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing AI prompt
        /// </summary>
        public async Task<PlusApiResultPlusAiPromptVO?> UpdateAsync(PlusAiPromptForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAiPromptVO>(ApiPaths.BackendPath("/prompt"), body);
        }

        /// <summary>
        /// Create a new AI prompt
        /// </summary>
        public async Task<PlusApiResultPlusAiPromptVO?> CreateAsync(PlusAiPromptForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAiPromptVO>(ApiPaths.BackendPath("/prompt"), body);
        }

        /// <summary>
        /// Get AI prompts by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiPromptVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiPromptVO>(ApiPaths.BackendPath("/prompt/list"), body, query);
        }

        /// <summary>
        /// Get all AI prompts
        /// </summary>
        public async Task<PlusApiResultListPlusAiPromptVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAiPromptVO>(ApiPaths.BackendPath("/prompt/list/all"), body);
        }

        /// <summary>
        /// Get an AI prompt by ID
        /// </summary>
        public async Task<PlusApiResultPlusAiPromptVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAiPromptVO>(ApiPaths.BackendPath($"/prompt/{id}"));
        }

        /// <summary>
        /// Delete an AI prompt
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/prompt/{id}"));
        }
    }
}
