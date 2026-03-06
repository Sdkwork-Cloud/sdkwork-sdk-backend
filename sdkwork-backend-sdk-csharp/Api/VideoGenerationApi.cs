using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VideoGenerationApi
    {
        private readonly HttpClient _client;

        public VideoGenerationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create video generation task
        /// </summary>
        public async Task<PlusApiResultGenerateVideoVO?> CreateAsync(GenerateVideoForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerateVideoVO>(ApiPaths.BackendPath("/generation/video/create"), body);
        }

        /// <summary>
        /// Get video generation result
        /// </summary>
        public async Task<PlusApiResultGenerateVideoVO?> GetResultAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerateVideoVO>(ApiPaths.BackendPath($"/generation/video/result/{taskId}"));
        }
    }
}
