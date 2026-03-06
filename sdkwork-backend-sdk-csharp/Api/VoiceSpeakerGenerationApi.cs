using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VoiceSpeakerGenerationApi
    {
        private readonly HttpClient _client;

        public VoiceSpeakerGenerationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create voice speaker generation task
        /// </summary>
        public async Task<PlusApiResultGenerateVoiceSpeakerVO?> CreateAsync(GenerateVoiceSpeakerForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerateVoiceSpeakerVO>(ApiPaths.BackendPath("/generation/voice-speaker/create"), body);
        }

        /// <summary>
        /// Get voice speaker generation result
        /// </summary>
        public async Task<PlusApiResultGenerateVoiceSpeakerVO?> GetResultByTaskIdAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerateVoiceSpeakerVO>(ApiPaths.BackendPath($"/generation/voice-speaker/result/{taskId}"));
        }
    }
}
