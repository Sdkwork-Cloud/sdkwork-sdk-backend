using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ParticipantApi
    {
        private readonly HttpClient _client;

        public ParticipantApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing chat participant
        /// </summary>
        public async Task<PlusApiResultPlusParticipantVO?> UpdateAsync(PlusParticipantForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusParticipantVO>(ApiPaths.BackendPath("/participant"), body);
        }

        /// <summary>
        /// Create a new chat participant
        /// </summary>
        public async Task<PlusApiResultPlusParticipantVO?> CreateAsync(PlusParticipantForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusParticipantVO>(ApiPaths.BackendPath("/participant"), body);
        }

        /// <summary>
        /// Get chat participants by page
        /// </summary>
        public async Task<PlusApiResultPagePlusParticipantVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusParticipantVO>(ApiPaths.BackendPath("/participant/list"), body, query);
        }

        /// <summary>
        /// Get all chat participants
        /// </summary>
        public async Task<PlusApiResultListPlusParticipantVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusParticipantVO>(ApiPaths.BackendPath("/participant/list/all"), body);
        }

        /// <summary>
        /// Get a chat participant by ID
        /// </summary>
        public async Task<PlusApiResultPlusParticipantVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusParticipantVO>(ApiPaths.BackendPath($"/participant/{id}"));
        }

        /// <summary>
        /// Delete a chat participant
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/participant/{id}"));
        }
    }
}
