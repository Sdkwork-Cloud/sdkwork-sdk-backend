using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class MusicGenerationApi
    {
        private readonly HttpClient _client;

        public MusicGenerationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create music generation task
        /// </summary>
        public async Task<PlusApiResultGenerateMusicVO?> CreateAsync(GenerateMusicForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerateMusicVO>(ApiPaths.BackendPath("/generation/music/create"), body);
        }

        /// <summary>
        /// Get music generation result
        /// </summary>
        public async Task<PlusApiResultGenerateMusicVO?> GetResultAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerateMusicVO>(ApiPaths.BackendPath($"/generation/music/result/{taskId}"));
        }
    }
}
