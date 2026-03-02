using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ImageApi
    {
        private readonly HttpClient _client;

        public ImageApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing image
        /// </summary>
        public async Task<PlusApiResultPlusImageVO?> UpdateAsync(PlusImageForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusImageVO>(ApiPaths.BackendPath("/image"), body);
        }

        /// <summary>
        /// Create a new image
        /// </summary>
        public async Task<PlusApiResultPlusImageVO?> CreateAsync(PlusImageForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusImageVO>(ApiPaths.BackendPath("/image"), body);
        }

        /// <summary>
        /// Get images by page
        /// </summary>
        public async Task<PlusApiResultPagePlusImageVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusImageVO>(ApiPaths.BackendPath("/image/list"), body, query);
        }

        /// <summary>
        /// Get all images
        /// </summary>
        public async Task<PlusApiResultListPlusImageVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusImageVO>(ApiPaths.BackendPath("/image/list/all"), body);
        }

        /// <summary>
        /// Get an image by ID
        /// </summary>
        public async Task<PlusApiResultPlusImageVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusImageVO>(ApiPaths.BackendPath($"/image/{id}"));
        }

        /// <summary>
        /// Delete an image
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/image/{id}"));
        }
    }
}
