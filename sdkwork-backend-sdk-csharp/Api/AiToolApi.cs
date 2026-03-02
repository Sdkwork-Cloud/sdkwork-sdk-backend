using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AiToolApi
    {
        private readonly HttpClient _client;

        public AiToolApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing AI tool
        /// </summary>
        public async Task<PlusApiResultPlusAiToolVO?> UpdateAsync(PlusAiToolForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAiToolVO>(ApiPaths.BackendPath("/tool"), body);
        }

        /// <summary>
        /// Create a new AI tool
        /// </summary>
        public async Task<PlusApiResultPlusAiToolVO?> CreateAsync(PlusAiToolForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAiToolVO>(ApiPaths.BackendPath("/tool"), body);
        }

        /// <summary>
        /// Get AI tools by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiToolVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiToolVO>(ApiPaths.BackendPath("/tool/list"), body, query);
        }

        /// <summary>
        /// Get all AI tools
        /// </summary>
        public async Task<PlusApiResultListPlusAiToolVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAiToolVO>(ApiPaths.BackendPath("/tool/list/all"), body);
        }

        /// <summary>
        /// Get an AI tool by ID
        /// </summary>
        public async Task<PlusApiResultPlusAiToolVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAiToolVO>(ApiPaths.BackendPath($"/tool/{id}"));
        }

        /// <summary>
        /// Delete an AI tool
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/tool/{id}"));
        }
    }
}
