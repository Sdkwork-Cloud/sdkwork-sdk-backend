using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class FileDiskApi
    {
        private readonly HttpClient _client;

        public FileDiskApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing file disk
        /// </summary>
        public async Task<PlusApiResultPlusDiskVO?> UpdateAsync(PlusDiskForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusDiskVO>(ApiPaths.BackendPath("/disk"), body);
        }

        /// <summary>
        /// Create a new file disk
        /// </summary>
        public async Task<PlusApiResultPlusDiskVO?> CreateAsync(PlusDiskForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusDiskVO>(ApiPaths.BackendPath("/disk"), body);
        }

        /// <summary>
        /// Get file disks by page
        /// </summary>
        public async Task<PlusApiResultPagePlusDiskVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusDiskVO>(ApiPaths.BackendPath("/disk/list"), body, query);
        }

        /// <summary>
        /// Get all file disks
        /// </summary>
        public async Task<PlusApiResultListPlusDiskVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusDiskVO>(ApiPaths.BackendPath("/disk/list/all"), body);
        }

        /// <summary>
        /// Get a file disk by ID
        /// </summary>
        public async Task<PlusApiResultPlusDiskVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusDiskVO>(ApiPaths.BackendPath($"/disk/{id}"));
        }

        /// <summary>
        /// Delete a file disk
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/disk/{id}"));
        }
    }
}
