using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class DnsRecordApi
    {
        private readonly HttpClient _client;

        public DnsRecordApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing DNS record
        /// </summary>
        public async Task<PlusApiResultPlusDnsRecordVO?> UpdateAsync(PlusDnsRecordForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusDnsRecordVO>(ApiPaths.BackendPath("/net/dns/record"), body);
        }

        /// <summary>
        /// Create a new DNS record
        /// </summary>
        public async Task<PlusApiResultPlusDnsRecordVO?> CreateAsync(PlusDnsRecordForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusDnsRecordVO>(ApiPaths.BackendPath("/net/dns/record"), body);
        }

        /// <summary>
        /// Get DNS records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusDnsRecordVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusDnsRecordVO>(ApiPaths.BackendPath("/net/dns/record/list"), body, query);
        }

        /// <summary>
        /// Get all DNS records
        /// </summary>
        public async Task<PlusApiResultListPlusDnsRecordVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusDnsRecordVO>(ApiPaths.BackendPath("/net/dns/record/list/all"), body);
        }

        /// <summary>
        /// Get a DNS record by ID
        /// </summary>
        public async Task<PlusApiResultPlusDnsRecordVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusDnsRecordVO>(ApiPaths.BackendPath($"/net/dns/record/{id}"));
        }

        /// <summary>
        /// Delete a DNS record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/net/dns/record/{id}"));
        }
    }
}
