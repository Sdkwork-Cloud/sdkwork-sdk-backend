using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ModelApi
    {
        private readonly HttpClient _client;

        public ModelApi(HttpClient client)
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
        /// Update an existing AI model price
        /// </summary>
        public async Task<PlusApiResultPlusAiModelPriceVO?> UpdatePriceAsync(PlusAiModelPriceForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAiModelPriceVO>(ApiPaths.BackendPath("/model/price"), body);
        }

        /// <summary>
        /// Create a new AI model price
        /// </summary>
        public async Task<PlusApiResultPlusAiModelPriceVO?> CreatePriceAsync(PlusAiModelPriceForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAiModelPriceVO>(ApiPaths.BackendPath("/model/price"), body);
        }

        /// <summary>
        /// Get AI model prices by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiModelPriceVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiModelPriceVO>(ApiPaths.BackendPath("/model/price/list"), body, query);
        }

        /// <summary>
        /// Get all AI model prices
        /// </summary>
        public async Task<PlusApiResultListPlusAiModelPriceVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAiModelPriceVO>(ApiPaths.BackendPath("/model/price/list/all"), body);
        }

        /// <summary>
        /// Get AI model information by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiModelInfoVO?> CreateListByPageModelAsync(PlusAiModelInfoQueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiModelInfoVO>(ApiPaths.BackendPath("/model/list"), body, query);
        }

        /// <summary>
        /// Get all AI model information
        /// </summary>
        public async Task<PlusApiResultListPlusAiModelInfoVO?> CreateListAllEntitiesModelAsync(PlusAiModelInfoQueryListForm? body = null)
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

        /// <summary>
        /// Get an AI model price by ID
        /// </summary>
        public async Task<PlusApiResultPlusAiModelPriceVO?> GetByIdPriceAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAiModelPriceVO>(ApiPaths.BackendPath($"/model/price/{id}"));
        }

        /// <summary>
        /// Delete an AI model price
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeletePriceAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/model/price/{id}"));
        }
    }
}
