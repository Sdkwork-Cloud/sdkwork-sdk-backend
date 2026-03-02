using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VoiceSpeakerApi
    {
        private readonly HttpClient _client;

        public VoiceSpeakerApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing voice speaker
        /// </summary>
        public async Task<PlusApiResultPlusVoiceSpeakerVO?> UpdateAsync(PlusVoiceSpeakerForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVoiceSpeakerVO>(ApiPaths.BackendPath("/voice/speaker"), body);
        }

        /// <summary>
        /// Create a new voice speaker
        /// </summary>
        public async Task<PlusApiResultPlusVoiceSpeakerVO?> CreateAsync(PlusVoiceSpeakerForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVoiceSpeakerVO>(ApiPaths.BackendPath("/voice/speaker"), body);
        }

        /// <summary>
        /// Get voice speakers by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVoiceSpeakerVO?> ListPublicAsync(PlusVoiceSpeakerQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVoiceSpeakerVO>(ApiPaths.BackendPath("/voice/speaker/list_public"), body, query);
        }

        /// <summary>
        /// Get voice speakers by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVoiceSpeakerVO?> ListByPageAsync(PlusVoiceSpeakerQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVoiceSpeakerVO>(ApiPaths.BackendPath("/voice/speaker/list"), body, query);
        }

        /// <summary>
        /// Get all voice speakers
        /// </summary>
        public async Task<PlusApiResultListPlusVoiceSpeakerVO?> ListAllEntitiesAsync(PlusVoiceSpeakerQueryForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVoiceSpeakerVO>(ApiPaths.BackendPath("/voice/speaker/list/all"), body);
        }

        /// <summary>
        /// Get a voice speaker by ID
        /// </summary>
        public async Task<PlusApiResultPlusVoiceSpeakerVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVoiceSpeakerVO>(ApiPaths.BackendPath($"/voice/speaker/{id}"));
        }

        /// <summary>
        /// Delete a voice speaker
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/voice/speaker/{id}"));
        }
    }
}
