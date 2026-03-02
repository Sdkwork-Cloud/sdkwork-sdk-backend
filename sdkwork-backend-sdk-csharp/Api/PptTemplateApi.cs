using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class PptTemplateApi
    {
        private readonly HttpClient _client;

        public PptTemplateApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing PPT template
        /// </summary>
        public async Task<PlusApiResultPlusPptTemplateVO?> UpdateAsync(PlusPptTemplateForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusPptTemplateVO>(ApiPaths.BackendPath("/ppt/template"), body);
        }

        /// <summary>
        /// Create a new PPT template
        /// </summary>
        public async Task<PlusApiResultPlusPptTemplateVO?> CreateAsync(PlusPptTemplateForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusPptTemplateVO>(ApiPaths.BackendPath("/ppt/template"), body);
        }

        /// <summary>
        /// Get PPT templates by page
        /// </summary>
        public async Task<PlusApiResultPagePlusPptTemplateVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusPptTemplateVO>(ApiPaths.BackendPath("/ppt/template/list"), body, query);
        }

        /// <summary>
        /// Get all PPT templates
        /// </summary>
        public async Task<PlusApiResultListPlusPptTemplateVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusPptTemplateVO>(ApiPaths.BackendPath("/ppt/template/list/all"), body);
        }

        /// <summary>
        /// Get a PPT template by ID
        /// </summary>
        public async Task<PlusApiResultPlusPptTemplateVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusPptTemplateVO>(ApiPaths.BackendPath($"/ppt/template/{id}"));
        }

        /// <summary>
        /// Delete a PPT template
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/ppt/template/{id}"));
        }
    }
}
