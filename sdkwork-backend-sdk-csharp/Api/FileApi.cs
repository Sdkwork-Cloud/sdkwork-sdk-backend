using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class FileApi
    {
        private readonly HttpClient _client;

        public FileApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update existing file metadata
        /// </summary>
        public async Task<PlusApiResultPlusFileVO?> UpdateAsync(PlusFileForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusFileVO>(ApiPaths.BackendPath("/file"), body);
        }

        /// <summary>
        /// Create a new file metadata
        /// </summary>
        public async Task<PlusApiResultPlusFileVO?> CreateAsync(PlusFileForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusFileVO>(ApiPaths.BackendPath("/file"), body);
        }

        /// <summary>
        /// Update an existing file part
        /// </summary>
        public async Task<PlusApiResultPlusFilePartVO?> UpdatePartAsync(PlusFilePartForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusFilePartVO>(ApiPaths.BackendPath("/file/part"), body);
        }

        /// <summary>
        /// Create a new file part
        /// </summary>
        public async Task<PlusApiResultPlusFilePartVO?> CreatePartAsync(PlusFilePartForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusFilePartVO>(ApiPaths.BackendPath("/file/part"), body);
        }

        /// <summary>
        /// Update file content
        /// </summary>
        public async Task<PlusApiResultPlusFileContentVO?> UpdateContentAsync(PlusFileContentForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusFileContentVO>(ApiPaths.BackendPath("/file/content"), body);
        }

        /// <summary>
        /// Create file content
        /// </summary>
        public async Task<PlusApiResultPlusFileContentVO?> CreateContentAsync(PlusFileContentForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusFileContentVO>(ApiPaths.BackendPath("/file/content"), body);
        }

        /// <summary>
        /// Get file parts by page
        /// </summary>
        public async Task<PlusApiResultPagePlusFilePartVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusFilePartVO>(ApiPaths.BackendPath("/file/part/list"), body, query);
        }

        /// <summary>
        /// Get all file parts
        /// </summary>
        public async Task<PlusApiResultListPlusFilePartVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusFilePartVO>(ApiPaths.BackendPath("/file/part/list/all"), body);
        }

        /// <summary>
        /// Get file metadata by page
        /// </summary>
        public async Task<PlusApiResultPagePlusFileVO?> CreateListByPageFileAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusFileVO>(ApiPaths.BackendPath("/file/list"), body, query);
        }

        /// <summary>
        /// Get all file metadata
        /// </summary>
        public async Task<PlusApiResultListPlusFileVO?> CreateListAllEntitiesFileAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusFileVO>(ApiPaths.BackendPath("/file/list/all"), body);
        }

        /// <summary>
        /// Get Tree
        /// </summary>
        public async Task<PlusApiResultSetPlusTreeNodePlusFileVO?> GetTreeAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultSetPlusTreeNodePlusFileVO>(ApiPaths.BackendPath("/file/get_tree"), body, query);
        }

        /// <summary>
        /// Get file contents by page
        /// </summary>
        public async Task<PlusApiResultPagePlusFileContentVO?> CreateListByPageContentAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusFileContentVO>(ApiPaths.BackendPath("/file/content/list"), body, query);
        }

        /// <summary>
        /// Get all file contents
        /// </summary>
        public async Task<PlusApiResultListPlusFileContentVO?> CreateListAllEntitiesContentAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusFileContentVO>(ApiPaths.BackendPath("/file/content/list/all"), body);
        }

        /// <summary>
        /// Get file metadata by ID
        /// </summary>
        public async Task<PlusApiResultPlusFileVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusFileVO>(ApiPaths.BackendPath($"/file/{id}"));
        }

        /// <summary>
        /// Delete file metadata
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/file/{id}"));
        }

        /// <summary>
        /// Get a file part by ID
        /// </summary>
        public async Task<PlusApiResultPlusFilePartVO?> GetByIdPartAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusFilePartVO>(ApiPaths.BackendPath($"/file/part/{id}"));
        }

        /// <summary>
        /// Delete a file part
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeletePartAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/file/part/{id}"));
        }

        /// <summary>
        /// Get file content by ID
        /// </summary>
        public async Task<PlusApiResultPlusFileContentVO?> GetByIdContentAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusFileContentVO>(ApiPaths.BackendPath($"/file/content/{id}"));
        }

        /// <summary>
        /// Delete file content
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteContentAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/file/content/{id}"));
        }
    }
}
