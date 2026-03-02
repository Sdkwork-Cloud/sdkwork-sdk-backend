using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class PptTemplateSlideApi
    {
        private readonly HttpClient _client;

        public PptTemplateSlideApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing PPT template slide
        /// </summary>
        public async Task<PlusApiResultPlusPptTemplateSlideVO?> UpdateAsync(PlusPptTemplateSlideForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusPptTemplateSlideVO>(ApiPaths.BackendPath("/ppt/template/slide"), body);
        }

        /// <summary>
        /// Create a new PPT template slide
        /// </summary>
        public async Task<PlusApiResultPlusPptTemplateSlideVO?> CreateAsync(PlusPptTemplateSlideForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusPptTemplateSlideVO>(ApiPaths.BackendPath("/ppt/template/slide"), body);
        }

        /// <summary>
        /// Get PPT template slides by page
        /// </summary>
        public async Task<PlusApiResultPagePlusPptTemplateSlideVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusPptTemplateSlideVO>(ApiPaths.BackendPath("/ppt/template/slide/list"), body, query);
        }

        /// <summary>
        /// Get all PPT template slides
        /// </summary>
        public async Task<PlusApiResultListPlusPptTemplateSlideVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusPptTemplateSlideVO>(ApiPaths.BackendPath("/ppt/template/slide/list/all"), body);
        }

        /// <summary>
        /// Get a PPT template slide by ID
        /// </summary>
        public async Task<PlusApiResultPlusPptTemplateSlideVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusPptTemplateSlideVO>(ApiPaths.BackendPath($"/ppt/template/slide/{id}"));
        }

        /// <summary>
        /// Delete a PPT template slide
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/ppt/template/slide/{id}"));
        }
    }
}
