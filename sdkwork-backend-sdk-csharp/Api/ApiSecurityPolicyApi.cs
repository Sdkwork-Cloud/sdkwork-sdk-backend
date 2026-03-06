using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ApiSecurityPolicyApi
    {
        private readonly HttpClient _client;

        public ApiSecurityPolicyApi(HttpClient client)
        {
            _client = client;
        }

        public async Task<PlusApiResultPlusApiSecurityPolicyVO?> UpdateAsync(PlusApiSecurityPolicyForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusApiSecurityPolicyVO>(ApiPaths.BackendPath("/security/policy"), body);
        }

        public async Task<PlusApiResultPlusApiSecurityPolicyVO?> CreateAsync(PlusApiSecurityPolicyForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusApiSecurityPolicyVO>(ApiPaths.BackendPath("/security/policy"), body);
        }

        /// <summary>
        /// List policies by page
        /// </summary>
        public async Task<PlusApiResultPagePlusApiSecurityPolicyVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusApiSecurityPolicyVO>(ApiPaths.BackendPath("/security/policy/list"), body, query);
        }

        /// <summary>
        /// List all policies
        /// </summary>
        public async Task<PlusApiResultListPlusApiSecurityPolicyVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusApiSecurityPolicyVO>(ApiPaths.BackendPath("/security/policy/list/all"), body);
        }

        public async Task<PlusApiResultPlusApiSecurityPolicyVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusApiSecurityPolicyVO>(ApiPaths.BackendPath($"/security/policy/{id}"));
        }

        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/security/policy/{id}"));
        }
    }
}
