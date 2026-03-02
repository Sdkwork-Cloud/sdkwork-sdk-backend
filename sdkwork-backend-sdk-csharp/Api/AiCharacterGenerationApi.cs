using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AiCharacterGenerationApi
    {
        private readonly HttpClient _client;

        public AiCharacterGenerationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create character generation task
        /// </summary>
        public async Task<PlusApiResultGenerateCharacterVO?> CreateAsync(GenerateCharacterForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerateCharacterVO>(ApiPaths.BackendPath("/generation/character/create"), body);
        }

        /// <summary>
        /// Get character generation result
        /// </summary>
        public async Task<PlusApiResultGenerateCharacterVO?> GetResultAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerateCharacterVO>(ApiPaths.BackendPath($"/generation/character/result/{taskId}"));
        }
    }
}
