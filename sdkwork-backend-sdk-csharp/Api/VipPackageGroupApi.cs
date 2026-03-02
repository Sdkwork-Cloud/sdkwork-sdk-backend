using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VipPackageGroupApi
    {
        private readonly HttpClient _client;

        public VipPackageGroupApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing VIP package group
        /// </summary>
        public async Task<PlusApiResultPlusVipPackGroupVO?> UpdateAsync(PlusVipPackGroupForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipPackGroupVO>(ApiPaths.BackendPath("/vip/pack_group"), body);
        }

        /// <summary>
        /// Create a new VIP package group
        /// </summary>
        public async Task<PlusApiResultPlusVipPackGroupVO?> CreateAsync(PlusVipPackGroupForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipPackGroupVO>(ApiPaths.BackendPath("/vip/pack_group"), body);
        }

        /// <summary>
        /// List public
        /// </summary>
        public async Task<PlusApiResultPagePlusVipPackGroupVO?> ListPublicAsync(PlusVipPackGroupQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipPackGroupVO>(ApiPaths.BackendPath("/vip/pack_group/list_public"), body, query);
        }

        /// <summary>
        /// Get VIP package groups by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipPackGroupVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipPackGroupVO>(ApiPaths.BackendPath("/vip/pack_group/list"), body, query);
        }

        /// <summary>
        /// Get all VIP package groups
        /// </summary>
        public async Task<PlusApiResultListPlusVipPackGroupVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipPackGroupVO>(ApiPaths.BackendPath("/vip/pack_group/list/all"), body);
        }

        /// <summary>
        /// Get a VIP package group by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipPackGroupVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipPackGroupVO>(ApiPaths.BackendPath($"/vip/pack_group/{id}"));
        }

        /// <summary>
        /// Delete a VIP package group
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/pack_group/{id}"));
        }
    }
}
