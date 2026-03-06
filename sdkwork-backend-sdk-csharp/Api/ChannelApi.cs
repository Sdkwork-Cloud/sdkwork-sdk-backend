using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ChannelApi
    {
        private readonly HttpClient _client;

        public ChannelApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update channel
        /// </summary>
        public async Task<PlusApiResultPlusChannelVO?> UpdateAsync(PlusChannelForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusChannelVO>(ApiPaths.BackendPath("/channel"), body);
        }

        /// <summary>
        /// Create channel
        /// </summary>
        public async Task<PlusApiResultPlusChannelVO?> CreateAsync(PlusChannelForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusChannelVO>(ApiPaths.BackendPath("/channel"), body);
        }

        /// <summary>
        /// List channels by page
        /// </summary>
        public async Task<PlusApiResultPagePlusChannelVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusChannelVO>(ApiPaths.BackendPath("/channel/list"), body, query);
        }

        /// <summary>
        /// List all channels
        /// </summary>
        public async Task<PlusApiResultListPlusChannelVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChannelVO>(ApiPaths.BackendPath("/channel/list/all"), body);
        }

        /// <summary>
        /// Get channel by ID
        /// </summary>
        public async Task<PlusApiResultPlusChannelVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusChannelVO>(ApiPaths.BackendPath($"/channel/{id}"));
        }

        /// <summary>
        /// Delete channel
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/channel/{id}"));
        }
    }
}
