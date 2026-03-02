using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class DatasourceApi
    {
        private readonly HttpClient _client;

        public DatasourceApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing data source
        /// </summary>
        public async Task<PlusApiResultPlusDatasourceVO?> UpdateAsync(PlusDatasourceForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusDatasourceVO>(ApiPaths.BackendPath("/datasource"), body);
        }

        /// <summary>
        /// Create a new data source
        /// </summary>
        public async Task<PlusApiResultPlusDatasourceVO?> CreateAsync(PlusDatasourceForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusDatasourceVO>(ApiPaths.BackendPath("/datasource"), body);
        }

        public async Task<PlusApiResultBoolean?> StopAsync(Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/datasource/stop"), null, null, headers);
        }

        /// <summary>
        /// Get data sources by page
        /// </summary>
        public async Task<PlusApiResultPagePlusDatasourceVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusDatasourceVO>(ApiPaths.BackendPath("/datasource/list"), body, query);
        }

        /// <summary>
        /// Get all data sources
        /// </summary>
        public async Task<PlusApiResultListPlusDatasourceVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusDatasourceVO>(ApiPaths.BackendPath("/datasource/list/all"), body);
        }

        /// <summary>
        /// Create a chat completion with Datasource
        /// </summary>
        public async Task<ChatCompletionChunk?> CreateCompletionsAsync(ChatCompletionCreateForm body, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/datasource/chat/completions"), body, null, headers);
        }

        /// <summary>
        /// Get a data source by ID
        /// </summary>
        public async Task<PlusApiResultPlusDatasourceVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusDatasourceVO>(ApiPaths.BackendPath($"/datasource/{id}"));
        }

        /// <summary>
        /// Delete a data source
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/datasource/{id}"));
        }
    }
}
