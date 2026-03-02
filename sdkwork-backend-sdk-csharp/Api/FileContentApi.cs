using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class FileContentApi
    {
        private readonly HttpClient _client;

        public FileContentApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update file content
        /// </summary>
        public async Task<PlusApiResultPlusFileContentVO?> UpdateAsync(PlusFileContentForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusFileContentVO>(ApiPaths.BackendPath("/file/content"), body);
        }

        /// <summary>
        /// Create file content
        /// </summary>
        public async Task<PlusApiResultPlusFileContentVO?> CreateAsync(PlusFileContentForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusFileContentVO>(ApiPaths.BackendPath("/file/content"), body);
        }

        /// <summary>
        /// Get file contents by page
        /// </summary>
        public async Task<PlusApiResultPagePlusFileContentVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusFileContentVO>(ApiPaths.BackendPath("/file/content/list"), body, query);
        }

        /// <summary>
        /// Get all file contents
        /// </summary>
        public async Task<PlusApiResultListPlusFileContentVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusFileContentVO>(ApiPaths.BackendPath("/file/content/list/all"), body);
        }

        /// <summary>
        /// Get file content by ID
        /// </summary>
        public async Task<PlusApiResultPlusFileContentVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusFileContentVO>(ApiPaths.BackendPath($"/file/content/{id}"));
        }

        /// <summary>
        /// Delete file content
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/file/content/{id}"));
        }
    }
}
