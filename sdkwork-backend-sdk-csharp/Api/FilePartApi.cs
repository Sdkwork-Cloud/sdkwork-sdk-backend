using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class FilePartApi
    {
        private readonly HttpClient _client;

        public FilePartApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing file part
        /// </summary>
        public async Task<PlusApiResultPlusFilePartVO?> UpdateAsync(PlusFilePartForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusFilePartVO>(ApiPaths.BackendPath("/file/part"), body);
        }

        /// <summary>
        /// Create a new file part
        /// </summary>
        public async Task<PlusApiResultPlusFilePartVO?> CreateAsync(PlusFilePartForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusFilePartVO>(ApiPaths.BackendPath("/file/part"), body);
        }

        /// <summary>
        /// Get file parts by page
        /// </summary>
        public async Task<PlusApiResultPagePlusFilePartVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusFilePartVO>(ApiPaths.BackendPath("/file/part/list"), body, query);
        }

        /// <summary>
        /// Get all file parts
        /// </summary>
        public async Task<PlusApiResultListPlusFilePartVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusFilePartVO>(ApiPaths.BackendPath("/file/part/list/all"), body);
        }

        /// <summary>
        /// Get a file part by ID
        /// </summary>
        public async Task<PlusApiResultPlusFilePartVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusFilePartVO>(ApiPaths.BackendPath($"/file/part/{id}"));
        }

        /// <summary>
        /// Delete a file part
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/file/part/{id}"));
        }
    }
}
