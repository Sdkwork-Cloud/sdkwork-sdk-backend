using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class PptApi
    {
        private readonly HttpClient _client;

        public PptApi(HttpClient client)
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
        /// Update an existing PPT template slide
        /// </summary>
        public async Task<PlusApiResultPlusPptTemplateSlideVO?> UpdateSlideAsync(PlusPptTemplateSlideForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusPptTemplateSlideVO>(ApiPaths.BackendPath("/ppt/template/slide"), body);
        }

        /// <summary>
        /// Create a new PPT template slide
        /// </summary>
        public async Task<PlusApiResultPlusPptTemplateSlideVO?> CreateSlideAsync(PlusPptTemplateSlideForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusPptTemplateSlideVO>(ApiPaths.BackendPath("/ppt/template/slide"), body);
        }

        /// <summary>
        /// Get PPT template slides by page
        /// </summary>
        public async Task<PlusApiResultPagePlusPptTemplateSlideVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusPptTemplateSlideVO>(ApiPaths.BackendPath("/ppt/template/slide/list"), body, query);
        }

        /// <summary>
        /// Get all PPT template slides
        /// </summary>
        public async Task<PlusApiResultListPlusPptTemplateSlideVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusPptTemplateSlideVO>(ApiPaths.BackendPath("/ppt/template/slide/list/all"), body);
        }

        /// <summary>
        /// Render PPT template
        /// </summary>
        public async Task<PlusApiResult?> RenderAsync(PlusPptTemplateRenderForm body)
        {
            return await _client.PostAsync<PlusApiResult>(ApiPaths.BackendPath("/ppt/template/render"), body);
        }

        /// <summary>
        /// Get PPT templates by page
        /// </summary>
        public async Task<PlusApiResultPagePlusPptTemplateVO?> CreateListByPageTemplateAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusPptTemplateVO>(ApiPaths.BackendPath("/ppt/template/list"), body, query);
        }

        /// <summary>
        /// Get all PPT templates
        /// </summary>
        public async Task<PlusApiResultListPlusPptTemplateVO?> CreateListAllEntitiesTemplateAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusPptTemplateVO>(ApiPaths.BackendPath("/ppt/template/list/all"), body);
        }

        public async Task<PlusApiResultBoolean?> StopAsync(Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/ppt/template/chat/stop"), null, query, headers);
        }

        /// <summary>
        /// Create a chat completion with PPT template
        /// </summary>
        public async Task<ChatCompletionChunk?> CreateCompletionsAsync(ChatCompletionCreateForm body, Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/ppt/template/chat/completions"), body, query, headers);
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

        /// <summary>
        /// Get a PPT template slide by ID
        /// </summary>
        public async Task<PlusApiResultPlusPptTemplateSlideVO?> GetByIdSlideAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusPptTemplateSlideVO>(ApiPaths.BackendPath($"/ppt/template/slide/{id}"));
        }

        /// <summary>
        /// Delete a PPT template slide
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteSlideAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/ppt/template/slide/{id}"));
        }
    }
}
