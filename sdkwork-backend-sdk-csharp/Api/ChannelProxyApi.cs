using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ChannelProxyApi
    {
        private readonly HttpClient _client;

        public ChannelProxyApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update channel proxy
        /// </summary>
        public async Task<PlusApiResultPlusChannelProxyVO?> UpdateAsync(PlusChannelProxyForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusChannelProxyVO>(ApiPaths.BackendPath("/channel/proxy"), body);
        }

        /// <summary>
        /// Create channel proxy
        /// </summary>
        public async Task<PlusApiResultPlusChannelProxyVO?> CreateAsync(PlusChannelProxyForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusChannelProxyVO>(ApiPaths.BackendPath("/channel/proxy"), body);
        }

        /// <summary>
        /// List channel proxies by page
        /// </summary>
        public async Task<PlusApiResultPagePlusChannelProxyVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusChannelProxyVO>(ApiPaths.BackendPath("/channel/proxy/list"), body, query);
        }

        /// <summary>
        /// List all channel proxies
        /// </summary>
        public async Task<PlusApiResultListPlusChannelProxyVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChannelProxyVO>(ApiPaths.BackendPath("/channel/proxy/list/all"), body);
        }

        /// <summary>
        /// Get channel proxy by ID
        /// </summary>
        public async Task<PlusApiResultPlusChannelProxyVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusChannelProxyVO>(ApiPaths.BackendPath($"/channel/proxy/{id}"));
        }

        /// <summary>
        /// Delete channel proxy
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/channel/proxy/{id}"));
        }
    }
}
