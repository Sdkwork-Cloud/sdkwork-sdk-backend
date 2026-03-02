using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AiAudioGenerationApi
    {
        private readonly HttpClient _client;

        public AiAudioGenerationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create audio generation task
        /// </summary>
        public async Task<PlusApiResultGenerateAudioVO?> CreateAsync(GenerateAudioForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerateAudioVO>(ApiPaths.BackendPath("/generation/audio/create"), body);
        }

        /// <summary>
        /// Get audio generation result
        /// </summary>
        public async Task<PlusApiResultGenerateAudioVO?> GetResultAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerateAudioVO>(ApiPaths.BackendPath($"/generation/audio/result/{taskId}"));
        }
    }
}
