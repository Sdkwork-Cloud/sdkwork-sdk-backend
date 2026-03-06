using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AudioEffectGenerationApi
    {
        private readonly HttpClient _client;

        public AudioEffectGenerationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create audio effect generation task
        /// </summary>
        public async Task<PlusApiResultGenerateAudioEffectVO?> CreateAsync(GenerateAudioEffectForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerateAudioEffectVO>(ApiPaths.BackendPath("/generation/audio-effect/create"), body);
        }

        /// <summary>
        /// Get audio effect generation result
        /// </summary>
        public async Task<PlusApiResultGenerateAudioEffectVO?> GetResultAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerateAudioEffectVO>(ApiPaths.BackendPath($"/generation/audio-effect/result/{taskId}"));
        }
    }
}
