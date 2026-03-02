using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class MusicApi
    {
        private readonly HttpClient _client;

        public MusicApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update music
        /// </summary>
        public async Task<PlusApiResultPlusMusicVO?> UpdateAsync(PlusMusicForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusMusicVO>(ApiPaths.BackendPath("/music"), body);
        }

        /// <summary>
        /// Create new music
        /// </summary>
        public async Task<PlusApiResultPlusMusicVO?> CreateAsync(PlusMusicForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusMusicVO>(ApiPaths.BackendPath("/music"), body);
        }

        /// <summary>
        /// Get music records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusMusicVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusMusicVO>(ApiPaths.BackendPath("/music/list"), body, query);
        }

        /// <summary>
        /// Get all music records
        /// </summary>
        public async Task<PlusApiResultListPlusMusicVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusMusicVO>(ApiPaths.BackendPath("/music/list/all"), body);
        }

        /// <summary>
        /// Get music by ID
        /// </summary>
        public async Task<PlusApiResultPlusMusicVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusMusicVO>(ApiPaths.BackendPath($"/music/{id}"));
        }

        /// <summary>
        /// Delete music
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/music/{id}"));
        }
    }
}
