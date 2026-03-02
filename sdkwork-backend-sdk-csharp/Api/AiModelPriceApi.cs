using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AiModelPriceApi
    {
        private readonly HttpClient _client;

        public AiModelPriceApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing AI model price
        /// </summary>
        public async Task<PlusApiResultPlusAiModelPriceVO?> UpdateAsync(PlusAiModelPriceForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAiModelPriceVO>(ApiPaths.BackendPath("/model/price"), body);
        }

        /// <summary>
        /// Create a new AI model price
        /// </summary>
        public async Task<PlusApiResultPlusAiModelPriceVO?> CreateAsync(PlusAiModelPriceForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAiModelPriceVO>(ApiPaths.BackendPath("/model/price"), body);
        }

        /// <summary>
        /// Get AI model prices by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiModelPriceVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiModelPriceVO>(ApiPaths.BackendPath("/model/price/list"), body, query);
        }

        /// <summary>
        /// Get all AI model prices
        /// </summary>
        public async Task<PlusApiResultListPlusAiModelPriceVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAiModelPriceVO>(ApiPaths.BackendPath("/model/price/list/all"), body);
        }

        /// <summary>
        /// Get an AI model price by ID
        /// </summary>
        public async Task<PlusApiResultPlusAiModelPriceVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAiModelPriceVO>(ApiPaths.BackendPath($"/model/price/{id}"));
        }

        /// <summary>
        /// Delete an AI model price
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/model/price/{id}"));
        }
    }
}
