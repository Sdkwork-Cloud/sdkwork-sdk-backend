using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ImageGenerationApi
    {
        private readonly HttpClient _client;

        public ImageGenerationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create image generation task
        /// </summary>
        public async Task<PlusApiResultGenerateImageVO?> CreateAsync(GenerateImageForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerateImageVO>(ApiPaths.BackendPath("/generation/image/create"), body);
        }

        /// <summary>
        /// Get image generation result
        /// </summary>
        public async Task<PlusApiResultGenerateImageVO?> GetResultAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerateImageVO>(ApiPaths.BackendPath($"/generation/image/result/{taskId}"));
        }
    }
}
