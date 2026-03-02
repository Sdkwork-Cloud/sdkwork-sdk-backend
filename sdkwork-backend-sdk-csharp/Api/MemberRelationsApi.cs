using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class MemberRelationsApi
    {
        private readonly HttpClient _client;

        public MemberRelationsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update member relation
        /// </summary>
        public async Task<PlusApiResultPlusMemberRelationsVO?> UpdateAsync(PlusMemberRelationsForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusMemberRelationsVO>(ApiPaths.BackendPath("/organization/member-relations"), body);
        }

        /// <summary>
        /// Create member relation
        /// </summary>
        public async Task<PlusApiResultPlusMemberRelationsVO?> CreateAsync(PlusMemberRelationsForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusMemberRelationsVO>(ApiPaths.BackendPath("/organization/member-relations"), body);
        }

        /// <summary>
        /// Get member relations by page
        /// </summary>
        public async Task<PlusApiResultPagePlusMemberRelationsVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusMemberRelationsVO>(ApiPaths.BackendPath("/organization/member-relations/list"), body, query);
        }

        /// <summary>
        /// Get all member relations
        /// </summary>
        public async Task<PlusApiResultListPlusMemberRelationsVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusMemberRelationsVO>(ApiPaths.BackendPath("/organization/member-relations/list/all"), body);
        }

        /// <summary>
        /// Get member relation by ID
        /// </summary>
        public async Task<PlusApiResultPlusMemberRelationsVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusMemberRelationsVO>(ApiPaths.BackendPath($"/organization/member-relations/{id}"));
        }

        /// <summary>
        /// Delete member relation
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/organization/member-relations/{id}"));
        }
    }
}
