using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ChannelResourceApi
    {
        private readonly HttpClient _client;

        public ChannelResourceApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing channel resource
        /// </summary>
        public async Task<PlusApiResultPlusChannelResourceVO?> UpdateAsync(PlusChannelResourceForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusChannelResourceVO>(ApiPaths.BackendPath("/channel/resource"), body);
        }

        /// <summary>
        /// Create a new channel resource
        /// </summary>
        public async Task<PlusApiResultPlusChannelResourceVO?> CreateAsync(PlusChannelResourceForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusChannelResourceVO>(ApiPaths.BackendPath("/channel/resource"), body);
        }

        /// <summary>
        /// Get channel resources by page
        /// </summary>
        public async Task<PlusApiResultPagePlusChannelResourceVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusChannelResourceVO>(ApiPaths.BackendPath("/channel/resource/list"), body, query);
        }

        /// <summary>
        /// Get all channel resources
        /// </summary>
        public async Task<PlusApiResultListPlusChannelResourceVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChannelResourceVO>(ApiPaths.BackendPath("/channel/resource/list/all"), body);
        }

        /// <summary>
        /// Get a channel resource by ID
        /// </summary>
        public async Task<PlusApiResultPlusChannelResourceVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusChannelResourceVO>(ApiPaths.BackendPath($"/channel/resource/{id}"));
        }

        /// <summary>
        /// Delete a channel resource
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/channel/resource/{id}"));
        }
    }
}
