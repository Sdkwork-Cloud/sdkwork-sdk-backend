using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class InvitationCodeApi
    {
        private readonly HttpClient _client;

        public InvitationCodeApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing invitation code
        /// </summary>
        public async Task<PlusApiResultInvitationCodeVO?> UpdateAsync(InvitationCodeForm body)
        {
            return await _client.PutAsync<PlusApiResultInvitationCodeVO>(ApiPaths.BackendPath("/invitation/code"), body);
        }

        /// <summary>
        /// Create a new invitation code
        /// </summary>
        public async Task<PlusApiResultInvitationCodeVO?> CreateAsync(InvitationCodeForm body)
        {
            return await _client.PostAsync<PlusApiResultInvitationCodeVO>(ApiPaths.BackendPath("/invitation/code"), body);
        }

        /// <summary>
        /// Get invitation codes by page
        /// </summary>
        public async Task<PlusApiResultPageInvitationCodeVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPageInvitationCodeVO>(ApiPaths.BackendPath("/invitation/code/list"), body, query);
        }

        /// <summary>
        /// Get all invitation codes
        /// </summary>
        public async Task<PlusApiResultListInvitationCodeVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListInvitationCodeVO>(ApiPaths.BackendPath("/invitation/code/list/all"), body);
        }

        /// <summary>
        /// Get an invitation code by ID
        /// </summary>
        public async Task<PlusApiResultInvitationCodeVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultInvitationCodeVO>(ApiPaths.BackendPath($"/invitation/code/{id}"));
        }

        /// <summary>
        /// Delete an invitation code
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/invitation/code/{id}"));
        }
    }
}
