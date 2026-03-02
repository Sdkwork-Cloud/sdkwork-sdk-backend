using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class CharacterApi
    {
        private readonly HttpClient _client;

        public CharacterApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update character
        /// </summary>
        public async Task<PlusApiResultPlusCharacterVO?> UpdateAsync(PlusCharacterForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusCharacterVO>(ApiPaths.BackendPath("/character"), body);
        }

        /// <summary>
        /// Create character
        /// </summary>
        public async Task<PlusApiResultPlusCharacterVO?> CreateAsync(PlusCharacterForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusCharacterVO>(ApiPaths.BackendPath("/character"), body);
        }

        /// <summary>
        /// Get characters by page
        /// </summary>
        public async Task<PlusApiResultPagePlusCharacterVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusCharacterVO>(ApiPaths.BackendPath("/character/list"), body, query);
        }

        /// <summary>
        /// Get all characters
        /// </summary>
        public async Task<PlusApiResultListPlusCharacterVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusCharacterVO>(ApiPaths.BackendPath("/character/list/all"), body);
        }

        /// <summary>
        /// Get character by ID
        /// </summary>
        public async Task<PlusApiResultPlusCharacterVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusCharacterVO>(ApiPaths.BackendPath($"/character/{id}"));
        }

        /// <summary>
        /// Delete character
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/character/{id}"));
        }
    }
}
