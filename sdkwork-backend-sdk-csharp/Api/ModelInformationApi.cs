using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ModelInformationApi
    {
        private readonly HttpClient _client;

        public ModelInformationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update existing AI model information
        /// </summary>
        public async Task<PlusApiResultPlusAiModelInfoVO?> UpdateAsync(PlusAiModelInfoForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAiModelInfoVO>(ApiPaths.BackendPath("/model"), body);
        }

        /// <summary>
        /// Create a new AI model information
        /// </summary>
        public async Task<PlusApiResultPlusAiModelInfoVO?> CreateAsync(PlusAiModelInfoForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAiModelInfoVO>(ApiPaths.BackendPath("/model"), body);
        }

        /// <summary>
        /// Get AI model information by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiModelInfoVO?> ListByPageAsync(PlusAiModelInfoQueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiModelInfoVO>(ApiPaths.BackendPath("/model/list"), body, query);
        }

        /// <summary>
        /// Get all AI model information
        /// </summary>
        public async Task<PlusApiResultListPlusAiModelInfoVO?> ListAllEntitiesAsync(PlusAiModelInfoQueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAiModelInfoVO>(ApiPaths.BackendPath("/model/list/all"), body);
        }

        /// <summary>
        /// Get AI model information by ID
        /// </summary>
        public async Task<PlusApiResultPlusAiModelInfoVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAiModelInfoVO>(ApiPaths.BackendPath($"/model/{id}"));
        }

        /// <summary>
        /// Delete AI model information
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/model/{id}"));
        }
    }
}
