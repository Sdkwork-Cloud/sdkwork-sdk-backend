using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class OrganizationMemberApi
    {
        private readonly HttpClient _client;

        public OrganizationMemberApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update organization member
        /// </summary>
        public async Task<PlusApiResultPlusOrganizationMemberVO?> UpdateAsync(PlusOrganizationMemberForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusOrganizationMemberVO>(ApiPaths.BackendPath("/organization-member"), body);
        }

        /// <summary>
        /// Create organization member
        /// </summary>
        public async Task<PlusApiResultPlusOrganizationMemberVO?> CreateAsync(PlusOrganizationMemberForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusOrganizationMemberVO>(ApiPaths.BackendPath("/organization-member"), body);
        }

        /// <summary>
        /// Get organization members by page
        /// </summary>
        public async Task<PlusApiResultPagePlusOrganizationMemberVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusOrganizationMemberVO>(ApiPaths.BackendPath("/organization-member/list"), body, query);
        }

        /// <summary>
        /// Get all organization members
        /// </summary>
        public async Task<PlusApiResultListPlusOrganizationMemberVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusOrganizationMemberVO>(ApiPaths.BackendPath("/organization-member/list/all"), body);
        }

        /// <summary>
        /// Get organization member by ID
        /// </summary>
        public async Task<PlusApiResultPlusOrganizationMemberVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusOrganizationMemberVO>(ApiPaths.BackendPath($"/organization-member/{id}"));
        }

        /// <summary>
        /// Delete organization member
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/organization-member/{id}"));
        }
    }
}
