using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class GenerationApi
    {
        private readonly HttpClient _client;

        public GenerationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing AI generation record
        /// </summary>
        public async Task<PlusApiResultPlusAiGenerationVO?> UpdateAsync(PlusAiGenerationForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAiGenerationVO>(ApiPaths.BackendPath("/generation"), body);
        }

        /// <summary>
        /// Create a new AI generation record
        /// </summary>
        public async Task<PlusApiResultPlusAiGenerationVO?> CreateAsync(PlusAiGenerationForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAiGenerationVO>(ApiPaths.BackendPath("/generation"), body);
        }

        /// <summary>
        /// Update AI generated content
        /// </summary>
        public async Task<PlusApiResultPlusAiGenerationContentVO?> UpdateContentAsync(PlusAiGenerationContentForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAiGenerationContentVO>(ApiPaths.BackendPath("/generation/content"), body);
        }

        /// <summary>
        /// Create new AI generated content
        /// </summary>
        public async Task<PlusApiResultPlusAiGenerationContentVO?> CreateContentAsync(PlusAiGenerationContentForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAiGenerationContentVO>(ApiPaths.BackendPath("/generation/content"), body);
        }

        /// <summary>
        /// Create voice speaker generation task
        /// </summary>
        public async Task<PlusApiResultGenerateVoiceSpeakerVO?> CreateVoiceSpeakerAsync(GenerateVoiceSpeakerForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerateVoiceSpeakerVO>(ApiPaths.BackendPath("/generation/voice-speaker/create"), body);
        }

        /// <summary>
        /// Create video generation task
        /// </summary>
        public async Task<PlusApiResultGenerateVideoVO?> CreateVideoAsync(GenerateVideoForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerateVideoVO>(ApiPaths.BackendPath("/generation/video/create"), body);
        }

        /// <summary>
        /// Create music generation task
        /// </summary>
        public async Task<PlusApiResultGenerateMusicVO?> CreateMusicAsync(GenerateMusicForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerateMusicVO>(ApiPaths.BackendPath("/generation/music/create"), body);
        }

        /// <summary>
        /// Get AI generation records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiGenerationVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiGenerationVO>(ApiPaths.BackendPath("/generation/list"), body, query);
        }

        /// <summary>
        /// Get all AI generation records
        /// </summary>
        public async Task<PlusApiResultListPlusAiGenerationVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAiGenerationVO>(ApiPaths.BackendPath("/generation/list/all"), body);
        }

        /// <summary>
        /// Create image generation task
        /// </summary>
        public async Task<PlusApiResultGenerateImageVO?> CreateImageAsync(GenerateImageForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerateImageVO>(ApiPaths.BackendPath("/generation/image/create"), body);
        }

        /// <summary>
        /// Get AI generated content by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAiGenerationContentVO?> CreateListByPageContentAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAiGenerationContentVO>(ApiPaths.BackendPath("/generation/content/list"), body, query);
        }

        /// <summary>
        /// Get all AI generated content
        /// </summary>
        public async Task<PlusApiResultListPlusAiGenerationContentVO?> CreateListAllEntitiesContentAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAiGenerationContentVO>(ApiPaths.BackendPath("/generation/content/list/all"), body);
        }

        /// <summary>
        /// Create character generation task
        /// </summary>
        public async Task<PlusApiResultGenerateCharacterVO?> CreateCharacterAsync(GenerateCharacterForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerateCharacterVO>(ApiPaths.BackendPath("/generation/character/create"), body);
        }

        /// <summary>
        /// Create audio generation task
        /// </summary>
        public async Task<PlusApiResultGenerateAudioVO?> CreateAudioAsync(GenerateAudioForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerateAudioVO>(ApiPaths.BackendPath("/generation/audio/create"), body);
        }

        /// <summary>
        /// Create audio effect generation task
        /// </summary>
        public async Task<PlusApiResultGenerateAudioEffectVO?> CreateAudioEffectAsync(GenerateAudioEffectForm body)
        {
            return await _client.PostAsync<PlusApiResultGenerateAudioEffectVO>(ApiPaths.BackendPath("/generation/audio-effect/create"), body);
        }

        /// <summary>
        /// Get an AI generation record by ID
        /// </summary>
        public async Task<PlusApiResultPlusAiGenerationVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAiGenerationVO>(ApiPaths.BackendPath($"/generation/{id}"));
        }

        /// <summary>
        /// Delete an AI generation record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/generation/{id}"));
        }

        /// <summary>
        /// Get voice speaker generation result
        /// </summary>
        public async Task<PlusApiResultGenerateVoiceSpeakerVO?> GetResultByTaskIdAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerateVoiceSpeakerVO>(ApiPaths.BackendPath($"/generation/voice-speaker/result/{taskId}"));
        }

        /// <summary>
        /// Get video generation result
        /// </summary>
        public async Task<PlusApiResultGenerateVideoVO?> GetResultAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerateVideoVO>(ApiPaths.BackendPath($"/generation/video/result/{taskId}"));
        }

        /// <summary>
        /// Get music generation result
        /// </summary>
        public async Task<PlusApiResultGenerateMusicVO?> GetResultMusicAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerateMusicVO>(ApiPaths.BackendPath($"/generation/music/result/{taskId}"));
        }

        /// <summary>
        /// Get image generation result
        /// </summary>
        public async Task<PlusApiResultGenerateImageVO?> GetResultImageAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerateImageVO>(ApiPaths.BackendPath($"/generation/image/result/{taskId}"));
        }

        /// <summary>
        /// Get AI generated content by ID
        /// </summary>
        public async Task<PlusApiResultPlusAiGenerationContentVO?> GetByIdContentAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAiGenerationContentVO>(ApiPaths.BackendPath($"/generation/content/{id}"));
        }

        /// <summary>
        /// Delete AI generated content
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteContentAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/generation/content/{id}"));
        }

        /// <summary>
        /// Get character generation result
        /// </summary>
        public async Task<PlusApiResultGenerateCharacterVO?> GetResultCharacterAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerateCharacterVO>(ApiPaths.BackendPath($"/generation/character/result/{taskId}"));
        }

        /// <summary>
        /// Get audio generation result
        /// </summary>
        public async Task<PlusApiResultGenerateAudioVO?> GetResultAudioAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerateAudioVO>(ApiPaths.BackendPath($"/generation/audio/result/{taskId}"));
        }

        /// <summary>
        /// Get audio effect generation result
        /// </summary>
        public async Task<PlusApiResultGenerateAudioEffectVO?> GetResultAudioEffectAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultGenerateAudioEffectVO>(ApiPaths.BackendPath($"/generation/audio-effect/result/{taskId}"));
        }
    }
}
