using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class PartnerApi
    {
        private readonly HttpClient _client;

        public PartnerApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update a partner
        /// </summary>
        public async Task<PlusApiResultPlusPartnerVO?> UpdateAsync(PlusPartnerForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusPartnerVO>(ApiPaths.BackendPath("/partner"), body);
        }

        /// <summary>
        /// Create a new partner
        /// </summary>
        public async Task<PlusApiResultPlusPartnerVO?> CreateAsync(PlusPartnerForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusPartnerVO>(ApiPaths.BackendPath("/partner"), body);
        }

        /// <summary>
        /// Get partners by page
        /// </summary>
        public async Task<PlusApiResultPagePlusPartnerVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusPartnerVO>(ApiPaths.BackendPath("/partner/list"), body, query);
        }

        /// <summary>
        /// Get all partners
        /// </summary>
        public async Task<PlusApiResultListPlusPartnerVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusPartnerVO>(ApiPaths.BackendPath("/partner/list/all"), body);
        }

        /// <summary>
        /// Get a partner by ID
        /// </summary>
        public async Task<PlusApiResultPlusPartnerVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusPartnerVO>(ApiPaths.BackendPath($"/partner/{id}"));
        }

        /// <summary>
        /// Delete a partner
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/partner/{id}"));
        }
    }
}
