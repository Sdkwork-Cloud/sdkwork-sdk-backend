using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class DiskMemberApi
    {
        private readonly HttpClient _client;

        public DiskMemberApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing disk member
        /// </summary>
        public async Task<PlusApiResultPlusDiskMemberVO?> UpdateAsync(PlusDiskMemberForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusDiskMemberVO>(ApiPaths.BackendPath("/disk/member"), body);
        }

        /// <summary>
        /// Create a new disk member
        /// </summary>
        public async Task<PlusApiResultPlusDiskMemberVO?> CreateAsync(PlusDiskMemberForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusDiskMemberVO>(ApiPaths.BackendPath("/disk/member"), body);
        }

        /// <summary>
        /// Get disk members by page
        /// </summary>
        public async Task<PlusApiResultPagePlusDiskMemberVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusDiskMemberVO>(ApiPaths.BackendPath("/disk/member/list"), body, query);
        }

        /// <summary>
        /// Get all disk members
        /// </summary>
        public async Task<PlusApiResultListPlusDiskMemberVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusDiskMemberVO>(ApiPaths.BackendPath("/disk/member/list/all"), body);
        }

        /// <summary>
        /// Get a disk member by ID
        /// </summary>
        public async Task<PlusApiResultPlusDiskMemberVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusDiskMemberVO>(ApiPaths.BackendPath($"/disk/member/{id}"));
        }

        /// <summary>
        /// Delete a disk member
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/disk/member/{id}"));
        }
    }
}
