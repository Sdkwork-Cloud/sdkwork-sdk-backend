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
        /// Update an existing channel resource
        /// </summary>
        public async Task<PlusApiResultPlusChannelResourceVO?> UpdateResourceAsync(PlusChannelResourceForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusChannelResourceVO>(ApiPaths.BackendPath("/channel/resource"), body);
        }

        /// <summary>
        /// Create a new channel resource
        /// </summary>
        public async Task<PlusApiResultPlusChannelResourceVO?> CreateResourceAsync(PlusChannelResourceForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusChannelResourceVO>(ApiPaths.BackendPath("/channel/resource"), body);
        }

        /// <summary>
        /// Update channel proxy
        /// </summary>
        public async Task<PlusApiResultPlusChannelProxyVO?> UpdateProxyAsync(PlusChannelProxyForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusChannelProxyVO>(ApiPaths.BackendPath("/channel/proxy"), body);
        }

        /// <summary>
        /// Create channel proxy
        /// </summary>
        public async Task<PlusApiResultPlusChannelProxyVO?> CreateProxyAsync(PlusChannelProxyForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusChannelProxyVO>(ApiPaths.BackendPath("/channel/proxy"), body);
        }

        /// <summary>
        /// Update channel account
        /// </summary>
        public async Task<PlusApiResultPlusChannelAccountVO?> UpdateAccountAsync(PlusChannelAccountForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusChannelAccountVO>(ApiPaths.BackendPath("/channel/account"), body);
        }

        /// <summary>
        /// Create channel account
        /// </summary>
        public async Task<PlusApiResultPlusChannelAccountVO?> CreateAccountAsync(PlusChannelAccountForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusChannelAccountVO>(ApiPaths.BackendPath("/channel/account"), body);
        }

        /// <summary>
        /// Get channel resources by page
        /// </summary>
        public async Task<PlusApiResultPagePlusChannelResourceVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusChannelResourceVO>(ApiPaths.BackendPath("/channel/resource/list"), body, query);
        }

        /// <summary>
        /// Get all channel resources
        /// </summary>
        public async Task<PlusApiResultListPlusChannelResourceVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChannelResourceVO>(ApiPaths.BackendPath("/channel/resource/list/all"), body);
        }

        /// <summary>
        /// List channel proxies by page
        /// </summary>
        public async Task<PlusApiResultPagePlusChannelProxyVO?> CreateListByPageProxyAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusChannelProxyVO>(ApiPaths.BackendPath("/channel/proxy/list"), body, query);
        }

        /// <summary>
        /// List all channel proxies
        /// </summary>
        public async Task<PlusApiResultListPlusChannelProxyVO?> CreateListAllEntitiesProxyAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChannelProxyVO>(ApiPaths.BackendPath("/channel/proxy/list/all"), body);
        }

        /// <summary>
        /// List channels by page
        /// </summary>
        public async Task<PlusApiResultPagePlusChannelVO?> CreateListByPageChannelAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusChannelVO>(ApiPaths.BackendPath("/channel/list"), body, query);
        }

        /// <summary>
        /// List all channels
        /// </summary>
        public async Task<PlusApiResultListPlusChannelVO?> CreateListAllEntitiesChannelAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChannelVO>(ApiPaths.BackendPath("/channel/list/all"), body);
        }

        /// <summary>
        /// Get SMS channel accounts
        /// </summary>
        public async Task<PlusApiResultListPlusChannelAccountVO?> ListSmsAsync(PlusChannelAccountQueryForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChannelAccountVO>(ApiPaths.BackendPath("/channel/account/list_sms"), body);
        }

        /// <summary>
        /// Get payment channel accounts
        /// </summary>
        public async Task<PlusApiResultListPlusChannelAccountVO?> ListPaymentAsync(PlusChannelAccountQueryForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChannelAccountVO>(ApiPaths.BackendPath("/channel/account/list_payment"), body);
        }

        /// <summary>
        /// Get OSS channel accounts
        /// </summary>
        public async Task<PlusApiResultListPlusChannelAccountVO?> ListOssAsync(PlusChannelAccountQueryForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChannelAccountVO>(ApiPaths.BackendPath("/channel/account/list_oss"), body);
        }

        /// <summary>
        /// Get official account channel accounts
        /// </summary>
        public async Task<PlusApiResultListPlusChannelAccountVO?> ListOfficialAccountAsync(PlusChannelAccountQueryForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChannelAccountVO>(ApiPaths.BackendPath("/channel/account/list_official_account"), body);
        }

        /// <summary>
        /// Get mini program channel accounts
        /// </summary>
        public async Task<PlusApiResultListPlusChannelAccountVO?> ListMiniProgramAsync(PlusChannelAccountQueryForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChannelAccountVO>(ApiPaths.BackendPath("/channel/account/list_mini_program"), body);
        }

        /// <summary>
        /// Get channel accounts by page
        /// </summary>
        public async Task<PlusApiResultPagePlusChannelAccountVO?> CreateListByPageAccountAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusChannelAccountVO>(ApiPaths.BackendPath("/channel/account/list"), body, query);
        }

        /// <summary>
        /// Get all channel accounts
        /// </summary>
        public async Task<PlusApiResultListPlusChannelAccountVO?> CreateListAllEntitiesAccountAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChannelAccountVO>(ApiPaths.BackendPath("/channel/account/list/all"), body);
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

        /// <summary>
        /// Get a channel resource by ID
        /// </summary>
        public async Task<PlusApiResultPlusChannelResourceVO?> GetByIdResourceAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusChannelResourceVO>(ApiPaths.BackendPath($"/channel/resource/{id}"));
        }

        /// <summary>
        /// Delete a channel resource
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteResourceAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/channel/resource/{id}"));
        }

        /// <summary>
        /// Get channel proxy by ID
        /// </summary>
        public async Task<PlusApiResultPlusChannelProxyVO?> GetByIdProxyAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusChannelProxyVO>(ApiPaths.BackendPath($"/channel/proxy/{id}"));
        }

        /// <summary>
        /// Delete channel proxy
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteProxyAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/channel/proxy/{id}"));
        }

        /// <summary>
        /// Get channel account by ID
        /// </summary>
        public async Task<PlusApiResultPlusChannelAccountVO?> GetByIdAccountAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusChannelAccountVO>(ApiPaths.BackendPath($"/channel/account/{id}"));
        }

        /// <summary>
        /// Delete channel account
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAccountAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/channel/account/{id}"));
        }
    }
}
