using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VideoApi
    {
        private readonly HttpClient _client;

        public VideoApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing video
        /// </summary>
        public async Task<PlusApiResultPlusVideoVO?> UpdateAsync(PlusVideoForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVideoVO>(ApiPaths.BackendPath("/video"), body);
        }

        /// <summary>
        /// Create a new video
        /// </summary>
        public async Task<PlusApiResultPlusVideoVO?> CreateAsync(PlusVideoForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVideoVO>(ApiPaths.BackendPath("/video"), body);
        }

        /// <summary>
        /// Get videos by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVideoVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVideoVO>(ApiPaths.BackendPath("/video/list"), body, query);
        }

        /// <summary>
        /// Get all videos
        /// </summary>
        public async Task<PlusApiResultListPlusVideoVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVideoVO>(ApiPaths.BackendPath("/video/list/all"), body);
        }

        /// <summary>
        /// Get a video by ID
        /// </summary>
        public async Task<PlusApiResultPlusVideoVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVideoVO>(ApiPaths.BackendPath($"/video/{id}"));
        }

        /// <summary>
        /// Delete a video
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/video/{id}"));
        }
    }
}
