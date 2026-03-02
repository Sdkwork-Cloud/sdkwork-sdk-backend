using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ChannelAccountApi
    {
        private readonly HttpClient _client;

        public ChannelAccountApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update channel account
        /// </summary>
        public async Task<PlusApiResultPlusChannelAccountVO?> UpdateAsync(PlusChannelAccountForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusChannelAccountVO>(ApiPaths.BackendPath("/channel/account"), body);
        }

        /// <summary>
        /// Create channel account
        /// </summary>
        public async Task<PlusApiResultPlusChannelAccountVO?> CreateAsync(PlusChannelAccountForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusChannelAccountVO>(ApiPaths.BackendPath("/channel/account"), body);
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
        public async Task<PlusApiResultPagePlusChannelAccountVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusChannelAccountVO>(ApiPaths.BackendPath("/channel/account/list"), body, query);
        }

        /// <summary>
        /// Get all channel accounts
        /// </summary>
        public async Task<PlusApiResultListPlusChannelAccountVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusChannelAccountVO>(ApiPaths.BackendPath("/channel/account/list/all"), body);
        }

        /// <summary>
        /// Get channel account by ID
        /// </summary>
        public async Task<PlusApiResultPlusChannelAccountVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusChannelAccountVO>(ApiPaths.BackendPath($"/channel/account/{id}"));
        }

        /// <summary>
        /// Delete channel account
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/channel/account/{id}"));
        }
    }
}
